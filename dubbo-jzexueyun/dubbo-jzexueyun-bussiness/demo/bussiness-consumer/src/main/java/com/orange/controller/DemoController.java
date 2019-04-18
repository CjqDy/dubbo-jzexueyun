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
import com.orange.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


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
    @RequestMapping(value = "/sayHello2", method = RequestMethod.POST)
    public void sayHello2(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId) {
        for (int i = 0; i < 10; i++) {
            pool.submit(() -> {
                try {
                    //设置qps阈值在125左右，接口平均响应时间在35ms,计算结果在并发数为4~5条
                    //实际结果为6~8条
                    String message = demoService.sayHello3("world");
                    System.out.println("Success: " + message+ LocalDateTime.now());
                } catch (RpcException ex) {
                    logger.info("blocked"+LocalDateTime.now());
                } catch (SentinelRpcException ex) {
                    logger.info("blocked22"+LocalDateTime.now());
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
//            pool.submit(() -> {
//                demoService.sayHello();
//                System.out.println("hello 123"+LocalDateTime.now());
//            });
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
