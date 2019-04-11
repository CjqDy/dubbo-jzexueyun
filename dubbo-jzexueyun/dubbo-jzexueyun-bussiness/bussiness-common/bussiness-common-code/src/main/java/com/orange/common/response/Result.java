package com.orange.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Result implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty(value="RESULT_CODE")
	public int resultCode;
	@JsonProperty(value="RESULT_DESC")
	public String resultDesc;
	@JsonProperty(value="RESULT_NUM")
	public int resultNum;
	
	public Result(){
		super();
	}
	
	public Result(int resultCode , String resultDesc , int resultNum){
		
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
		this.resultNum  = resultNum;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public int getResultNum() {
		return resultNum;
	}

	public void setResultNum(int resultNum) {
		this.resultNum = resultNum;
	}


	
	
}
