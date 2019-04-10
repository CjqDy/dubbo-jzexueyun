package com.orange.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.orange.common.util.RedisUtil;
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

    @Autowired
    RedisUtil redisUtil;

    @Override
    public void sayHello() {
        redisUtil.set("key_001","成佳奇");
        UserBase userbase= userBaseMapper.selectByPrimaryKey("123");
        System.out.println(userbase);
        System.out.println(redisUtil.get("key_001"));
    }
}
