package com.orange.log.aop;

import java.lang.annotation.*;

/**
 * @program: dubbo-jzexueyun
 * @description: 注解标记
 * @author: chengjiaqi
 * @create: 2019/04/24 15:40
 **/
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemControllerLog {
    String method() default "";
    String desc() default "";
}
