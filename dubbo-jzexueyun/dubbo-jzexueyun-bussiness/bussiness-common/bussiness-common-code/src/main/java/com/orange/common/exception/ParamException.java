package com.orange.common.exception;



public class ParamException extends BaseException {


  public ParamException() {
    super();
  }

  public ParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public ParamException(String message, Throwable cause) {
    super(message, cause);
  }

  public ParamException(String message) {
    super(message);
  }

  public ParamException(Throwable cause) {
    super(cause);
  }
}
