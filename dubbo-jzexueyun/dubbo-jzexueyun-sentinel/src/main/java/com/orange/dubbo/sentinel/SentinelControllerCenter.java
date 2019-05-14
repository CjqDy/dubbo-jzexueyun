package com.orange.dubbo.sentinel;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.orange.common.contants.GeneralConstant;
import com.orange.common.contants.SentinelConstant;
import com.orange.common.util.PropertiesFileUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program: dubbo-jzexueyun
 * @description:sentinel sentinel控制器
 * @author: chengjiaqi
 * @create: 2019/04/16 17:58
 **/
public class SentinelControllerCenter {

    private static PropertiesFileUtil propertiesFileUtil = PropertiesFileUtil
            .getInstance(GeneralConstant.PROPERTIES_sentinel);

    private String sentinelSource;

    private static List<FlowRule> flowRuleList = new LinkedList<FlowRule>();

    private static List<DegradeRule> degradeRuleList = new LinkedList<DegradeRule>();

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


    /**
     * 初始化sentinel
     */
    private static void init(){
        for(Map<String,String> map : list){
            if(SentinelConstant.SENTINEL_FLOWRULE_TYPE.equals(map.get("type"))){
                //多线程并发/QPS
                FlowRule flowRule = initFlowRule(map.get("sourceUri"),map.get("count"),map.get("grade"));
                flowRuleList.add(flowRule);
            }
            if(SentinelConstant.SENTINEL_DEGRADERULE_TYPE.equals(map.get("type"))){
                //降级熔断/RT
                DegradeRule degradeRule = initDegradeRule(map.get("sourceUri"),map.get("count"),map.get("grade"));
                degradeRuleList.add(degradeRule);
            }
        }
        FlowRuleManager.loadRules(flowRuleList);
        DegradeRuleManager.loadRules(degradeRuleList);
    }

    /**
     * 流量规则定义
     * @param sentinelSource
     * @param count
     * @param grade
     * @return
     */
    private static FlowRule initFlowRule(String sentinelSource,String count,String grade) {
        FlowRule flowRule = new FlowRule();
        flowRule.setResource(sentinelSource);
        flowRule.setCount(Integer.parseInt(count));
        flowRule.setGrade(Integer.parseInt(grade));
        flowRule.setLimitApp("default");
        flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT); // 默认:快速失败/立即拒绝
        return flowRule;
    }


    /**
     * 降级规则定义
     * @param sentinelSource
     * @param count
     * @param grade
     * @return
     */
    private static  DegradeRule initDegradeRule(String sentinelSource,String count,String grade) {
        DegradeRule degradeRule = new DegradeRule();
        degradeRule.setResource(sentinelSource);
        degradeRule.setCount(Integer.parseInt(count));//ms
        degradeRule.setGrade(RuleConstant.DEGRADE_GRADE_RT);//response time
        degradeRule.setTimeWindow(10);//降级时间 //s
        return degradeRule;
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
