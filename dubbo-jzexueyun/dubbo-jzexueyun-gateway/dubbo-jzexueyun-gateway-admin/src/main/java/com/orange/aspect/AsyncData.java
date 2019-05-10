package com.orange.aspect;

import com.orange.entity.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
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

    Logger logger = LoggerFactory.getLogger(AsyncData.class);

    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * 处理操作日志
     *
     * @param list
     */
    public void dataToMongo(List<Action> list) {
        //TODO:do something
        for (Action action : list) {
            System.out.println("action : " + action);
            mongoTemplate.save(action, "action");
        }
        logger.info("log finished---");
    }

}
