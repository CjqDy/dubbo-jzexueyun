package com.orange.common.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @program: dubbo-jzexueyun
 * @description: 响应数据封装
 * @author: chengjiaqi
 * @create: 2019/04/08 17:50
 **/
public class ResponseMsg implements Serializable{
	
	private static final long serialVersionUID = -2461017938431758852L;
	@JsonProperty(value = "RESULT")  
	public Result result;
	@JsonProperty(value = "ROUTE")  
	public ResponseRoute route;
	@JsonProperty(value = "ROOT")  
	public Object root;

	
	public ResponseMsg(){
		super();
	}
	
	public  ResponseMsg(Result resultRes , ResponseRoute resultRoute , Object resultRoot){
		this.result = resultRes;
		this.route = resultRoute;
		this.root = resultRoot;
	}
	
	public ResponseMsg(Route resultRoute , int status, String errorMsg, Object content){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ResponseRoute resultRou = new ResponseRoute();
		resultRou.setReceive(resultRoute.getSender());
		resultRou.setSender(resultRoute.getReceive());
		resultRou.setTime(sdf.format(new Date()));
		resultRou.setMsgtype("response");
		resultRou.setServcode(resultRoute.getServcode());
		resultRou.setSysSign(resultRoute.getSysSign());
		resultRou.setTransId(resultRoute.getTransId());
		resultRou.setVersion(resultRoute.getVersion());
		resultRou.setSysTime(System.currentTimeMillis());
		this.route = resultRou;
		Result resultRes = new Result();
		resultRes.setResultNum(0);
		resultRes.setResultDesc(errorMsg);
		resultRes.setResultCode(status);
		this.result = resultRes;
		if(content==null){
			this.root = new HashMap<>();
		}else{
			this.root = content;
		}
	}
	
	@JsonIgnore
	public Result getResult() {
		return result;
	}
	@JsonIgnore
	public void setResult(Result result) {
		this.result = result;
	}
	@JsonIgnore
	public ResponseRoute getRoute() {
		return route;
	}
	@JsonIgnore
	public void setRoute(ResponseRoute route) {
		this.route = route;
	}
	@JsonIgnore
	public Object getRoot() {
		return root;
	}
	@JsonIgnore
	public void setRoot(Object root) {
		this.root = root;
	}
	
}
