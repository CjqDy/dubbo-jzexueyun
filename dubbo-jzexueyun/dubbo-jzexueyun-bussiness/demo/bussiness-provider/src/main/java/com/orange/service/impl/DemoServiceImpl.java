package com.orange.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;


import com.alibaba.dubbo.config.annotation.Service;
import com.orange.dao.UserBaseMapper;
import com.orange.entity.demo.UserBase;
import com.orange.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;


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

    @Override
    public void sayHello() {

        UserBase userbase= userBaseMapper.selectByPrimaryKey("123");
        System.out.println(userbase);
    }
}
