package com.orange.common.exception;

/**
 * @program: dubbo-jzexueyun
 * @description: 系统异常
 * @author: chengjiaqi
 * @create: 2019/04/08 17:50
 **/
public class GlobalException extends Exception{

	private static final long serialVersionUID = 1L;

	public GlobalException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public GlobalException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GlobalException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public GlobalException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
