package com.orange.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Route implements Serializable{
	private static final long serialVersionUID = -2461017938431758852L;
	@JsonProperty(value="SENDER")
	public String sender;
	@JsonProperty(value="RECEIVE")
	public String receive;
	@JsonProperty(value="TIME")
	public String time;
	@JsonProperty(value="SERVCODE")
	public String servcode;
	@JsonProperty(value="MSGTYPE")
	public String msgtype;
	@JsonProperty(value="TRANSID")
	public String transId;
	@JsonProperty(value="VERSION")
	public String version;
	@JsonProperty(value="SYSSIGN")
	public String sysSign;
	@JsonProperty(value="ACCESSTOKEN")
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
