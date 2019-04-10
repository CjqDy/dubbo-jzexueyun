package com.orange.common.exception;


import com.orange.common.enums.ExceptionLevelEnum;
import com.orange.common.enums.ReturnMsgEnum;

/**
 * 配置异常 例如：properties配置错了
 *
 * @author lizhihua
 * @date 2017/10/20.
 */
public class ConfigException extends BaseException {

	private static final long serialVersionUID = 1L;

	public ConfigException(String msg) {
		super(msg);
	}

	public ConfigException(Throwable exception) {
		super(exception);
	}

	public ConfigException(String msg, Exception exception) {
		super(msg, exception);
	}

	@Override
	public ReturnMsgEnum getMsgEnum() {
		return ReturnMsgEnum.CONFIG_ERROR;
	}

	@Override
	public ExceptionLevelEnum getLevel() {
		return ExceptionLevelEnum.WARN;
	}
}
