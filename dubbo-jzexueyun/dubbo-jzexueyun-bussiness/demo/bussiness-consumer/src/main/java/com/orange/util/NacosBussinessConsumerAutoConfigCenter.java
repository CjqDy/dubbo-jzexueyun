package com.orange.util;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import com.orange.common.service.NacosAutoConfigCenter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @program: dubbo-jzexueyun
 * @description: NacosAutoConfigCenter
 * @author: chengjiaqi
 * @create: 2019/05/05 15:21
 **/
public class NacosBussinessConsumerAutoConfigCenter implements NacosAutoConfigCenter {

    public static  String res = "";

    @Override
    public void getNacosSystemProperties(String serverAddr, String dataId, String group) {
        Properties properties = new Properties();
        properties.setProperty("serverAddr",serverAddr);
        try {
            ConfigService configService = NacosFactory.createConfigService(properties);
            String content = configService.getConfig(dataId,group,5000);
            configService.addListener(dataId, group, new Listener() {
                @Override
                public Executor getExecutor() {
                    return null;
                }

                @Override
                public void receiveConfigInfo(String s) {
                    res = s;
                }
            });
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
}
