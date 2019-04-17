package com.orange.dubbo.sentinel;

import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.orange.common.contants.GeneralConstant;
import com.orange.common.util.PropertiesFileUtil;
import com.orange.dubbo.fallback.DemoFallback;
import org.springframework.stereotype.Component;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/16 17:58
 **/
public class SentinelControllerCenter {

    private static PropertiesFileUtil propertiesFileUtil = PropertiesFileUtil
            .getInstance(GeneralConstant.PROPERTIES_sentinel);

    private String sentinelSource;

    private static List<Map<String,String>> list;

    public SentinelControllerCenter(String sentinelName) {
        sentinelSource = propertiesFileUtil.get(sentinelName);
        List<Map<String,String>> list = null;
        if (sentinelSource != null){
            list = getSentinelSource(sentinelSource);
        }
        this.list = list;
        init();
    }

    private static void init(){
        for(Map<String,String> map : list){
            if("0".equals(map.get("type"))){
                //多线程并发控制
                initFlowRule(map.get("sourceUri"),map.get("count"));
            }
            if("1".equals(map.get("type"))){
                //降级熔断
                initDegradeRule(map.get("sourceUri"),map.get("count"));
            }
        }
    }

    /**
     * 多线程并发控制
     */
    private static void initFlowRule(String sentinelSource,String count) {
        FlowRule flowRule = new FlowRule();
        flowRule.setResource(sentinelSource);
        flowRule.setCount(Integer.parseInt(count));
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setLimitApp("default");
        flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT); // 默认:快速失败/立即拒绝
        FlowRuleManager.loadRules(Collections.singletonList(flowRule));
    }

    /**
     * 熔断降级
     */
    private static  void initDegradeRule(String sentinelSource,String count) {
        DegradeRule degradeRule = new DegradeRule();
        degradeRule.setResource(sentinelSource);
        degradeRule.setCount(Integer.parseInt(count));//ms
        degradeRule.setGrade(RuleConstant.DEGRADE_GRADE_RT);//response time
        degradeRule.setTimeWindow(10);
        DegradeRuleManager.loadRules(Collections.singletonList(degradeRule));
    }


    private static List<Map<String, String>> getSentinelSource(String str) {
        List<Map<String, String>> list = new LinkedList<Map<String, String>>();
        JSONArray json = (JSONArray) JSONArray.parse(str);
        for (Object object : json) {
            Map maps = (Map) JSON.parse(object.toString());
            list.add(maps);
        }
        return list;

    }


}
