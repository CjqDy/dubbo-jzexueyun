package com.orange.common.exception;


/**
 * @program: dubbo-jzexueyun
 * @description: 参数异常
 * @author: chengjiaqi
 * @create: 2019/04/08 17:50
 **/
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
