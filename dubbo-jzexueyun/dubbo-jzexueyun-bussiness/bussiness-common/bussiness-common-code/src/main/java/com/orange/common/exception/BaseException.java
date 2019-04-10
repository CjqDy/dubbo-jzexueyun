package com.orange.common.exception;


import com.orange.common.enums.ExceptionLevelEnum;
import com.orange.common.enums.ReturnMsgEnum;

/**
 * 基础异常
 *
 * @author lizhihua
 * @date 2017 /10/20.
 */
public abstract class BaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BaseException(String msg) {
		super(msg);
	}

	public BaseException(Throwable exception) {
		super(exception);
	}

	public BaseException(String msg, Exception exception) {
		super(msg, exception);
	}

	/**
	 * Gets msg enum.
	 *
	 * @return the msg enum
	 */
	public abstract ReturnMsgEnum getMsgEnum();

	/**
	 * Gets level.
	 *
	 * @return the level
	 */
	public abstract ExceptionLevelEnum getLevel();

}
