package com.orange.controller;

import com.orange.common.contants.GeneralConstant;
import com.orange.common.exception.BaseException;
import com.orange.common.exception.ParamException;
import com.orange.common.response.RequestMsg;
import com.orange.common.response.ResponseMsg;
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
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public ResponseMsg test(@RequestHeader("Uid") String userId,@RequestBody RequestMsg requestMsg){
        System.out.println();
        if(!"1233".equals(userId)){
            throw new ParamException("base error");
        }
        System.out.println("no param");
        demoService.sayHello();
        return new ResponseMsg(requestMsg.getRoute(), GeneralConstant.SUCCESS, "查询成功", null);
    }

}
