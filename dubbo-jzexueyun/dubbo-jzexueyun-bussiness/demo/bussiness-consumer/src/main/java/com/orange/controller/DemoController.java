package com.orange.controller;

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



}
