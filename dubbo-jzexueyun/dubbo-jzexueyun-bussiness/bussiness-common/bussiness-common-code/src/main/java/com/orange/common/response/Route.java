package com.orange.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel(value = "系统参数")
public class Route implements Serializable{
	private static final long serialVersionUID = -2461017938431758852L;
	@JsonProperty(value="SENDER")
	@ApiModelProperty(value="发送者(默认为：jzexueyun)")
	public String sender;
	@JsonProperty(value="RECEIVE")
	@ApiModelProperty(value="接收者")
	public String receive;
	@JsonProperty(value="TIME")
	@ApiModelProperty(value="时间")
	public String time;
	@JsonProperty(value="SERVCODE")
	@ApiModelProperty(value="服务器code")
	public String servcode;
	@JsonProperty(value="MSGTYPE")
	@ApiModelProperty(value="请求方式")
	public String msgtype;
	@JsonProperty(value="TRANSID")
	@ApiModelProperty(value="时间戳")
	public String transId;
	@JsonProperty(value="VERSION")
	@ApiModelProperty(value="版本")
	public String version;
	@JsonProperty(value="SYSSIGN")
	@ApiModelProperty(value="系统标签")
	public String sysSign;
	@JsonProperty(value="ACCESSTOKEN")
	@ApiModelProperty(value="token")
	public String accessToken;
	public Route() {
		super();
	}
	
	public Route(String sender , String receive , String time ,String servcode , String msgtype , String transId,String version,String sysSign,String accessToken) {
		this.sender = sender;
		this.receive = receive;
		this.time = time;
		this.servcode = servcode;
		this.msgtype = msgtype;
		this.transId = transId;
		this.version = version;
		this.sysSign = sysSign;
		this.accessToken = accessToken;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceive() {
		return receive;
	}

	public void setReceive(String receive) {
		this.receive = receive;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getServcode() {
		return servcode;
	}

	public void setServcode(String servcode) {
		this.servcode = servcode;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSysSign() {
		return sysSign;
	}

	public void setSysSign(String sysSign) {
		this.sysSign = sysSign;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	

	
	
}
