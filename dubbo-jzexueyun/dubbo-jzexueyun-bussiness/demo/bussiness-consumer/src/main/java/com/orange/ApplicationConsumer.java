package com.orange;



import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.orange.dubbo.fallback.DemoFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import java.util.List;

import javax.annotation.PostConstruct;

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



    public static void main(String[] args) {

        SpringApplication.run(ApplicationConsumer.class,args);
        System.out.println("demo-consumer-start................");
    }

}
