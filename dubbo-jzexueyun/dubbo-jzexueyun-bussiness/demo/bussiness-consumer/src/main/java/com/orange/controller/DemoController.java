package com.orange.controller;

import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.alibaba.csp.sentinel.slots.block.SentinelRpcException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.orange.common.contants.GeneralConstant;
import com.orange.common.exception.BaseException;
import com.orange.common.exception.ParamException;
import com.orange.common.response.RequestMsg;
import com.orange.common.response.ResponseMsg;
import com.orange.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;


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
    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    public void sayHello() {
        demoService.sayHello();
    }

    @ResponseBody
    @RequestMapping(value = "/sayHello2", method = RequestMethod.POST)
    public void sayHello2(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId) {
//        try {
//            demoService.sayHello();
//            System.out.println("Success: ");
//        } catch (SentinelRpcException ex) {
//            //目前无法捕获SentinelRpcException
//            System.out.println("blocked");
////            DubboFallbackRegistry.getProviderFallback();
//        } catch (Exception ex) {
////            DubboFallbackRegistry.getProviderFallback();
//            ex.printStackTrace();
//        }
        for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                long start = 0L;
                long end = 0L;
                for (; ; ) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(5);

                        start = System.currentTimeMillis();
                        demoService.sayHello3("world");
                        end = System.currentTimeMillis();

                        System.out.println(Thread.currentThread().getName() + " Success: " + ", 耗时:" + (end - start));
                    } catch (SentinelRpcException ex) {
                        end = System.currentTimeMillis();
                        System.out.println(Thread.currentThread().getName() + " Blocked, 耗时:" + (end - start));
                    } catch (Exception ex) {
                        end = System.currentTimeMillis();
                        System.out.println(Thread.currentThread().getName() + " Blocked, 耗时:" + (end - start));
                    }
                }
            }).start();
        }


    }


    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseMsg test(@RequestHeader("Uid") String userId, @RequestBody RequestMsg requestMsg) {
        System.out.println();
        if (!"1233".equals(userId)) {
            throw new ParamException("base error");
        }
        System.out.println("no param");
        demoService.sayHello();
        return new ResponseMsg(requestMsg.getRoute(), GeneralConstant.SUCCESS, "查询成功", null);
    }

}
