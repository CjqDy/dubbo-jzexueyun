package com.orange;


import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;


import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.orange.common.exception.GlobalException;
import com.orange.common.service.NacosAutoConfigCenter;
import com.orange.util.NacosBussinessConsumerAutoConfigCenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.Properties;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/08 17:16
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:/spring/spring.xml"})
@ServletComponentScan
public class ApplicationConsumer {



    public static void main(String[] args){
        SpringApplication.run(ApplicationConsumer.class, args);
        System.out.println("demo-consumer-start................");
//        init nacos 配置中心
        try {
            NacosAutoConfigCenter nacosAutoConfigCenter = new NacosBussinessConsumerAutoConfigCenter();
            nacosAutoConfigCenter.getNacosSystemProperties("127.0.0.1:8848","nacos-consumer-application.properties","DEFAULT_GROUP");
        }catch (Exception e){
            throw new  GlobalException("Nacos auto config center error");
        }




    }


}
