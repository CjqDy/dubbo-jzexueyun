package com.orange.aspect;

import com.orange.entity.Action;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/24 15:55
 **/
@Service
public class AsyncData {

    @Async("asyncPoolTaskExecutor")
    public void dataToMongo(List<Action> list){
        //TODO:do something
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理完成");
    }

}
