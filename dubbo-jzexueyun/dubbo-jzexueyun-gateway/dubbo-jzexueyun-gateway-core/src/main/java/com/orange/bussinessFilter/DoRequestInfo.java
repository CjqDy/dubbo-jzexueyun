package com.orange.bussinessFilter;

import com.orange.common.exception.GlobalException;
import com.orange.common.exception.ParamException;
import com.orange.common.response.Route;
import com.orange.common.util.MD5Util;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

/**
 * @program: dubbo-jzexueyun
 * @description: 用户请求信息鉴权处理
 * @author: chengjiaqi
 * @create: 2019/04/23 15:35
 **/
public class DoRequestInfo {

    private String token = "", servCode = "", tranSid = "", sysSign = "";

    private final static String ROUTE = "ROUTE";
    private final static String ACCESS_TOKEN = "ACCESSTOKEN";
    private final static String SERV_CODE = "SERVCODE";
    private final static String TRANS_ID = "TRANSID";
    private final static String SYS_SIGN = "SYSSIGN";


    public DoRequestInfo(String body) {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject = jsonObject.fromObject(body);//将String转为JSON数据
            this.token = jsonObject.fromObject(jsonObject.getString(ROUTE)).getString(ACCESS_TOKEN);
            this.servCode = jsonObject.fromObject(jsonObject.getString(ROUTE)).getString(SERV_CODE);
            this.tranSid = jsonObject.fromObject(jsonObject.getString(ROUTE)).getString(TRANS_ID);
            this.sysSign = jsonObject.fromObject(jsonObject.getString(ROUTE)).getString(SYS_SIGN);
        } catch (Exception e) {
            // TODO: handle exception
            throw new ParamException("get route param error");
        }
    }

    /**
     *
     * Request base parameter authentication
     * @return
     */
    public void requestInfo() {
//        param is blank
        if(StringUtils.isBlank(token) || StringUtils.isBlank(servCode+tranSid) || StringUtils.isBlank(sysSign)){
            throw new ParamException("route param is null");
        }
        String md5Sign = MD5Util.MD5Encode(servCode+tranSid);
//        md5 auth error
        if(!sysSign.equals(md5Sign)){
            throw new GlobalException("auth error");
        }

    }





}
