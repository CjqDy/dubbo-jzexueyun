package com.orange;

import com.alibaba.dubbo.config.annotation.Reference;
import com.orange.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
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
@ServletComponentScan
public class ApplicationConsumer {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class,args);
        System.out.println("demo-consumer-start................");
    }

}
