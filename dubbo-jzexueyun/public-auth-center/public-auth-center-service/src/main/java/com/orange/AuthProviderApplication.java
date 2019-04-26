package com.orange;


import com.orange.common.contants.SentinelConstant;
import com.orange.dubbo.sentinel.SentinelControllerCenter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-jzexueyun
 * @description: AuthProviderApplication
 * @author: chengjiaqi
 * @create: 2019/04/26 10:30
 **/
public class AuthProviderApplication {



    public static void main(String[] args) throws IOException {

        //初始化SentinelControllerCenter
        try {
            SentinelControllerCenter sentinelControllerCenter = new SentinelControllerCenter(SentinelConstant.SENTINEL_AUTH_SERVICE_METHOD);
        }catch (Exception e){
            e.printStackTrace();
        }

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        System.out.println("authcenter-provider-start................");
        System.in.read();
    }



}
