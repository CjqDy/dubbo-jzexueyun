package com.orange.controller;

import com.orange.common.contants.GeneralConstant;
import com.orange.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/08 17:50
 **/
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;


    @ResponseBody
    @RequestMapping(value = "/sayHello/{id}",method = RequestMethod.GET)
    public void sayHello(){
        demoService.sayHello();
    }

    @ResponseBody
    @RequestMapping(value = "/sayHello2",method = RequestMethod.POST)
    public void sayHello2(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId){
        System.out.println("userId = "+userId);
        demoService.sayHello();
    }

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(){
        System.out.println("no param");
        demoService.sayHello();
    }

}
