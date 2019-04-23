package com.orange.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.orange.common.util.RedisUtil;
import com.orange.dao.UserBaseMapper;
import com.orange.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;


/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/08 15:58
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    UserBaseMapper userBaseMapper;

    @Autowired
    RedisUtil redisUtil;


    @Override
    public void sayHello() {
//        RedisUtil.set("haha","1111");
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("sayHello：success");
    }

    @Override
    public String sayHello3(String name) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return String.format("Hello, %s at %s", name, LocalDateTime.now());
    }

    @Override
    public String sayHello4(String name) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return String.format("Hello, %s at %s", name, LocalDateTime.now());
    }

    @Override
    public String sayHello5(String name) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return String.format("Hello, %s at %s", name, LocalDateTime.now());
    }

}
