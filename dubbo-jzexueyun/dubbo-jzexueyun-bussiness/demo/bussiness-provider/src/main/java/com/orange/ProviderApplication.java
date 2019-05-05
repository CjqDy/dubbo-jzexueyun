package com.orange;


import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySources;
import com.orange.common.contants.SentinelConstant;

import com.orange.dubbo.fallback.DemoFallback;
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

        //初始化SentinelControllerCenter
        try {
            SentinelControllerCenter sentinelControllerCenter = new SentinelControllerCenter(SentinelConstant.SENTINEL_DEMOS_SERVICE_METHOD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        System.out.println("demo-provider-start................");
        System.in.read();
    }


}
