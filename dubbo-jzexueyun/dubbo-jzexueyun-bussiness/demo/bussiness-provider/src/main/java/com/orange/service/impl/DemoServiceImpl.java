package com.orange.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.orange.service.DemoService;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/08 15:58
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.out.println("123");
    }
}
