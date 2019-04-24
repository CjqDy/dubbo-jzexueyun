package com.orange.log.aop;

import java.lang.annotation.*;

/**
 * @program: dubbo-jzexueyun
 * @description: SystemControllerLog
 * @author: Mr.Wang
 * @create: 2019/04/24 10:35
 **/
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemControllerLog {
    String method() default "";
    String desc() default "";
}
