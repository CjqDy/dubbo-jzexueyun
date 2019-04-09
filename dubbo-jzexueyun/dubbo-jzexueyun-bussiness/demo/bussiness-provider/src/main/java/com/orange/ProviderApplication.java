package com.orange;

import org.mybatis.spring.annotation.MapperScan;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        System.out.println("demo-provider-start................");
        System.in.read();
    }


}
