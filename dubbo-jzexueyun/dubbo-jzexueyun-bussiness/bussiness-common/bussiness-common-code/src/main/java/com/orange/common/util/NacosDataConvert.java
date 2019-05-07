package com.orange.common.util;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: dubbo-jzexueyun
 * @description: NacosDataConvert
 * @author: chengjiaqi
 * @create: 2019/05/05 15:39
 **/
public class NacosDataConvert {

    public static Map<String, Object> NacosConvert(String s) {
        Map<String, Object> map = new HashMap<>();
//        TODO
        String[] ss = s.split("\r\n");
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (String res : ss) {
            sb.append("\"").append(res.split("=")[0]).append("\"").append(":").append("\"").append(res.split("=")[1]).append("\"").append(",");
        }
        String result = sb.toString().substring(0,sb.toString().length()-1);
        result = result +"}";
        map = (Map)JSONObject.parse(result);
        return map;
    }

}
