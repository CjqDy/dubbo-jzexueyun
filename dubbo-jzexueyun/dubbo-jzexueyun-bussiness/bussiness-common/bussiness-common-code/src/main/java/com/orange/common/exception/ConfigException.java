package com.orange.common.exception;


/**
 * @program: dubbo-jzexueyun
 * @description: 配置异常
 * @author: chengjiaqi
 * @create: 2019/04/08 17:50
 **/
public class ConfigException extends BaseException {


	public ConfigException() {
		super();
	}


	public ConfigException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigException(String message) {
		super(message);
	}

	public ConfigException(Throwable cause) {
		super(cause);
	}
}
