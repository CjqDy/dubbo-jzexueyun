package com.orange;


import com.orange.common.contants.SentinelConstant;

import com.orange.dubbo.sentinel.SentinelControllerCenter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-jzexueyun
 * @description: ProviderApplication
 * @author: chengjiaqi
 * @create: 2019/04/08 15:51
 **/
public class ProviderApplication {



    public static void main(String[] args) throws IOException {
        SentinelControllerCenter sentinelControllerCenter = new SentinelControllerCenter(SentinelConstant.SENTINEL_DEMOS_SERVICE_METHOD);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        System.out.println("demo-provider-start................");
        System.in.read();
    }



}
