package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: dubbo-jzexueyun
 * @description: auth-starter
 * @author: chengjiaqi
 * @create: 2019/04/26 10:34
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:/spring/spring.xml"})
@ServletComponentScan
public class AuthConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(AuthConsumerApplication.class,args);
        System.out.println("authcenter-consumer-start................");
    }
}
