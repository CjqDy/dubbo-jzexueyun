package com.orange.common.service;

/**
 * @program: dubbo-jzexueyun
 * @description: nacos配置中心
 * @author: chengjiaqi
 * @create: 2019/05/05 15:18
 **/
public interface NacosAutoConfigCenter {

    public void getNacosSystemProperties(String serverAddr , String dataId,String group);

}
