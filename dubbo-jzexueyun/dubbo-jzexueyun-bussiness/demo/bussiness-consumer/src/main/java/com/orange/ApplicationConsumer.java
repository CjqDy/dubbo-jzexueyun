package com.orange;

import com.alibaba.dubbo.config.annotation.Reference;
import com.orange.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.PostConstruct;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/08 17:16
 **/
@SpringBootApplication
@ImportResource({"classpath:/spring/spring.xml"})
public class ApplicationConsumer {

//    @Reference
//    private DemoService demoService;

    @PostConstruct
    public void init(){
//        demoService.sayHello();
    }


    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class,args);
    }

}
