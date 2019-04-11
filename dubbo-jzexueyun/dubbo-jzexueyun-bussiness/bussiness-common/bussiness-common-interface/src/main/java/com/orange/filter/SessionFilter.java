package com.orange.filter;

import com.alibaba.fastjson.JSONObject;
import com.orange.common.contants.GeneralConstant;
import com.orange.common.enums.ReturnMsgEnum;
import com.orange.common.exception.handler.GlobalExceptionHandler;
import com.orange.common.response.ResponseMsg;
import com.orange.common.response.Route;
import com.orange.common.util.PropertiesFileUtil;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @program: dubbo-jzexueyun
 * @description: 业务接口过滤器
 * @author: chengjiaqi
 * @create: 2019/04/10 15:39
 **/
@WebFilter(urlPatterns = "/*")
public class SessionFilter implements Filter {

    private static PropertiesFileUtil propertiesFileUtil = PropertiesFileUtil
            .getInstance(GeneralConstant.PROPERTIES_COMMON);


    private static String tokenCheckExcludeUrlKeys = propertiesFileUtil
            .get(GeneralConstant.TOKEN_CHECK_EXCULDE_URL_KEY);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-------------enter session filter");
        //TODO: bussiness auth operation
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        String uri = request.getRequestURI();
        //Filter the interface address without authentication
        if(isTokenExcludeUrl(uri)){
            System.out.println("uri without auth");
            filterChain.doFilter(request, response);
            return;
        }
        System.out.println("uri within auth");
        MutableHttpServletRequest requestWrapper = null;
        if(request instanceof HttpServletRequest) {
            requestWrapper = new MutableHttpServletRequest((HttpServletRequest) request);
        }
        String body = getRequestbody(requestWrapper);
        String token = "",servCode = "", tranSid = "" , sysSign = "";
        //TODO:validate interface and user data start
        //获取body中的鉴权码和token
//        try {
//            net.sf.json.JSONObject jsonObject = new net.sf.json.JSONObject();
//            jsonObject = jsonObject.fromObject(body);//将String转为JSON数据
//            token =  jsonObject.fromObject(jsonObject.getString("ROUTE")).getString("ACCESSTOKEN");
//            servCode = jsonObject.fromObject(jsonObject.getString("ROUTE")).getString("SERVCODE");
//            tranSid = jsonObject.fromObject(jsonObject.getString("ROUTE")).getString("TRANSID");
//            sysSign = jsonObject.fromObject(jsonObject.getString("ROUTE")).getString("SYSSIGN");
//        } catch (Exception e) {
//            // TODO: handle exception
//            //ResultModel resultModel = new ResultModel(ReturnMsgEnum.TOKEN_ILLEGAL.getCode(),
//            //ReturnMsgEnum.TOKEN_ILLEGAL.getMsg(), null, System.currentTimeMillis());
//            Route route = new Route();
//            ResponseMsg responseMsg = new ResponseMsg(route, ReturnMsgEnum.TOKEN_ILLEGAL.getCode(),
//                    ReturnMsgEnum.TOKEN_ILLEGAL.getMsg(), "");
//            GlobalExceptionHandler.responseJsonRes(response, responseMsg);
//            return;
//        }

        //end
        //userId Package to Header
        //E.g:requestWrapper.putHeader("userId", "1111");
        requestWrapper.putHeader(GeneralConstant.HEADER_NAME_UID, "1111");
        // return request infomation
        if(requestWrapper == null) {
            filterChain.doFilter(request, response);
        } else {
            filterChain.doFilter(requestWrapper, response);
        }
    }

    @Override
    public void destroy() {

    }

    private String getRequestbody(HttpServletRequest request) {
        String param= null;
        try {
            BufferedReader streamReader = new BufferedReader( new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            JSONObject jsonObject = JSONObject.parseObject(responseStrBuilder.toString());
            param= jsonObject.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return param;
    }

    private boolean isTokenExcludeUrl(String requestURI) {

        if (StringUtils.isBlank(tokenCheckExcludeUrlKeys)) {
            return false;
        }

        String[] tokenCheckExcludeUrlKeyArray = tokenCheckExcludeUrlKeys
                .split(GeneralConstant.COMMA);
        for (String urlKey : tokenCheckExcludeUrlKeyArray) {
            if (requestURI.contains(urlKey.trim())) {
                return true;
            }
        }

        return false;
    }
    private class MutableHttpServletRequest extends HttpServletRequestWrapper {


        private final Map<String, String> customHeaders;
        private byte[] body;

        public MutableHttpServletRequest(HttpServletRequest request) {
            super(request);
            this.customHeaders = new HashMap<String, String>();
            body = getRequestbody(request).getBytes(Charset.forName("UTF-8"));
        }

        public void putHeader(String name, String value) {
            this.customHeaders.put(name, value);
        }

        @Override
        public String getHeader(String name) {
            // check the custom headers first
            String headerValue = customHeaders.get(name);

            if (headerValue != null) {
                return headerValue;
            }
            // else return from into the original wrapped object
            return ((HttpServletRequest) getRequest()).getHeader(name);

        }

        @Override
        public Enumeration<String> getHeaders(String name) {

            if (customHeaders.containsKey(name)) {
                return new Enumeration<String>() {
                    boolean hasNext = true;

                    @Override
                    public boolean hasMoreElements() {
                        return hasNext;
                    }

                    @Override
                    public String nextElement() {
                        hasNext = false;
                        return customHeaders.get(name);
                    }
                };
            }
            return super.getHeaders(name);
        }

        @Override
        public Enumeration<String> getHeaderNames() {
            // create a set of the custom header names
            Set<String> set = new HashSet<String>(customHeaders.keySet());

            // now add the headers from the wrapped request object
            Enumeration<String> e = ((HttpServletRequest) getRequest()).getHeaderNames();
            while (e.hasMoreElements()) {
                // add the names of the request headers into the list
                String n = e.nextElement();
                set.add(n);
            }

            // create an enumeration from the set and return
            return Collections.enumeration(set);
        }

        @Override
        public BufferedReader getReader() throws IOException {
            return new BufferedReader(new InputStreamReader(getInputStream()));
        }

        @Override
        public ServletInputStream getInputStream() throws IOException {
            final ByteArrayInputStream bais = new ByteArrayInputStream(body);
            return new ServletInputStream() {

                @Override
                public int read() throws IOException {
                    return bais.read();
                }

                @Override
                public boolean isFinished() {
                    // TODO Auto-generated method stub
                    return false;
                }

                @Override
                public boolean isReady() {
                    // TODO Auto-generated method stub
                    return false;
                }

                @Override
                public void setReadListener(ReadListener readListener) {
                    // TODO Auto-generated method stub

                }
            };
        }

    }

}
