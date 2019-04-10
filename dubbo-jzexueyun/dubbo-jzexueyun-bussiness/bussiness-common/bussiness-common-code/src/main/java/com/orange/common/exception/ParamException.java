package com.orange.common.exception;


import com.orange.common.enums.ExceptionLevelEnum;
import com.orange.common.enums.ReturnMsgEnum;

/**
 * 参数异常
 *
 * @author lizhihua
 * @date 2017/10/20.
 */
public class ParamException extends BaseException {

  public ParamException(String msg) {
    super(msg);
  }

  public ParamException(Throwable exception) {
    super(exception);
  }

  public ParamException(String msg, Exception exception) {
    super(msg, exception);
  }

  @Override
  public ReturnMsgEnum getMsgEnum() {
    return ReturnMsgEnum.PARAM_ERROR;
  }

  @Override
  public ExceptionLevelEnum getLevel() {
    return ExceptionLevelEnum.INFO;
  }
}
