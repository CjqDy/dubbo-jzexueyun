package com.orange.controller;

import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.alibaba.csp.sentinel.concurrent.NamedThreadFactory;
import com.alibaba.csp.sentinel.slots.block.SentinelRpcException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.dubbo.rpc.RpcException;
import com.orange.common.contants.GeneralConstant;
import com.orange.common.exception.BaseException;
import com.orange.common.exception.ParamException;
import com.orange.common.exception.SentinelException;
import com.orange.common.response.RequestMsg;
import com.orange.common.response.ResponseMsg;
import com.orange.log.aop.SystemControllerLog;
import com.orange.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/08 17:50
 **/
@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;


    private static final ExecutorService pool = Executors.newFixedThreadPool(10,
            new NamedThreadFactory("dubbo-consumer-pool"));

    @ResponseBody
    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    public void sayHello() {
        demoService.sayHello();
    }

    @ResponseBody
    @RequestMapping(value = "/sayHello3", method = RequestMethod.POST)
    public void sayHello3(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId) {
        //设置Thread阈值为7，即并发量为7
        //实际结果为6~8条
        for (int i = 0; i < 10; i++) {
            final int a = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String message = demoService.sayHello3("Eric" + a);
                        System.out.println("Success: " + a + "---" + message);
                    } catch (RpcException ex) {
                        System.out.println("Blocked" + a + "---");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/sayHello4", method = RequestMethod.POST)
    @SystemControllerLog(method = "sayHello4",desc = "haha")
    public void sayHello4(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId) {
//        设置QPS(每秒请求数)为6
        for (int i = 0; i < 10; i++) {
            final int a = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String message = demoService.sayHello4("Eric" + a);
                        System.out.println("Success: " + a + "---" + message);
                    } catch (RpcException ex) {
                        System.out.println("Blocked" + a + "---");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();
        }
    }


    @ResponseBody
    @RequestMapping(value = "/sayHello5", method = RequestMethod.POST)
    public void sayHello5(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId) {
//      当资源的平均响应时间超过阈值（DegradeRule 中的 count，以 ms 为单位）之后，资源进入准降级状态。接下来如果持续进入 5 个请求，它们的 RT 都持续超过这个阈值，那么在接下的时间窗口（DegradeRule 中的 timeWindow，以 s 为单位）之内，对这个方法的调用都会自动地返回（抛出 DegradeException）
        for (int i = 0; i < 10000; i++) {

            try {
                String message = demoService.sayHello5("Eric");
                System.out.println("Success: " + "---" + i + message);
            } catch (RpcException ex) {
                System.out.println("Blocked" + i + "---");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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
