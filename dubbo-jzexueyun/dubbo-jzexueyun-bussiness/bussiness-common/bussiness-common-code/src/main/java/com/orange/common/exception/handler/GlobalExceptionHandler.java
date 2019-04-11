package com.orange.common.exception.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.orange.common.exception.ConfigException;
import com.orange.common.exception.ParamException;
import com.orange.common.util.TransToUpperUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.orange.common.exception.GlobalException;
import com.orange.common.enums.ReturnMsgEnum;
import com.orange.common.response.ResponseMsg;
import com.orange.common.response.Route;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {
	private static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	private static final String APPLICATION_JSON = "application/json";
	private static final String UTF_8 = "UTF-8";

	@ExceptionHandler(GlobalException.class)
	@ResponseBody
	public ResponseMsg HandleGlobalException(Exception e){
		//只能输出捕获到的异常，未捕获到的异常不输出到日志，或者通过aop拦截器拦截所有方法
		String message = getExceptionDetail(e);
		//返回失败信息
		Route route = new Route();
		ResponseMsg responseMsg = new ResponseMsg(route,ReturnMsgEnum.INTERNAL_ERROR.getCode(),
				ReturnMsgEnum.INTERNAL_ERROR.getMsg(), message);
		return responseMsg;
	}

	@ExceptionHandler(ConfigException.class)
	@ResponseBody
	public ResponseMsg HandleConfigException(Exception e){
		//只能输出捕获到的异常，未捕获到的异常不输出到日志，或者通过aop拦截器拦截所有方法
		String message = getExceptionDetail(e);
		//返回失败信息
		Route route = new Route();
		ResponseMsg responseMsg = new ResponseMsg(route,ReturnMsgEnum.CONFIG_ERROR.getCode(),
				ReturnMsgEnum.CONFIG_ERROR.getMsg(), message);
		return responseMsg;
	}

	@ExceptionHandler(ParamException.class)
	@ResponseBody
	public ResponseMsg HandleParamException(Exception e){
		//只能输出捕获到的异常，未捕获到的异常不输出到日志，或者通过aop拦截器拦截所有方法
		String message = getExceptionDetail(e);
		//返回失败信息
		Route route = new Route();
		ResponseMsg responseMsg = new ResponseMsg(route,ReturnMsgEnum.PARAM_ERROR.getCode(),
				ReturnMsgEnum.PARAM_ERROR.getMsg(), message);
		return responseMsg;
	}

	public String getExceptionDetail(Exception e) {
		String message = e.toString().split(":")!=null?(e.toString()).split(":")[1]:"no message";
		return message;
	}

	public static void responseJsonRes(HttpServletResponse response, ResponseMsg resultModel) {
		response.setContentType(APPLICATION_JSON);
		response.setCharacterEncoding(UTF_8);

		PrintWriter writer = null;
		try {
			response.setStatus(200);
			writer = response.getWriter();
			ObjectMapper objectMapper = new ObjectMapper();
			writer.write(JSONObject
					.fromObject(TransToUpperUtil.transToUpperObject(objectMapper.writeValueAsString(resultModel).toString()))
					.toString());

		} catch (IOException e) {
			// 通常，用户关掉了页面，就会发生IOException，不做处理
		} finally {
			if (writer != null) {
				writer.flush();
				writer.close();
			}
		}
	}


}