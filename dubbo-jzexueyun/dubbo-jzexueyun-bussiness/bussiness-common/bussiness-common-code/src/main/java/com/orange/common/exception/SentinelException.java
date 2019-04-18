package com.orange.common.exception;


/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/18 14:26
 **/
public class SentinelException extends  RuntimeException {
    public SentinelException() {
        super();
    }

    public SentinelException(String s) {
        super(s);
    }

    public SentinelException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public SentinelException(Throwable throwable) {
        super(throwable);
    }

    public SentinelException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
