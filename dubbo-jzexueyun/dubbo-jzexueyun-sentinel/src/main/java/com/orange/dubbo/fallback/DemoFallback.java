package com.orange.dubbo.fallback;

import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallback;
import com.alibaba.csp.sentinel.adapter.dubbo.fallback.DubboFallbackRegistry;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.SentinelRpcException;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcResult;
import com.alibaba.fastjson.JSONObject;


import java.util.HashMap;
import java.util.Map;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/17 11:40
 **/
public class DemoFallback implements DubboFallback {
    @Override
    public Result handle(Invoker<?> invoker, Invocation invocation, BlockException e) {
        StringBuffer sb = new StringBuffer();
        sb.append(invoker.getInterface().toString());
        Map<String, Object> map = new HashMap<>(2);
        map.put("code", "120023");
        map.put("message", "QPS exceeded the threshold set by Sentinel : " + sb);
        return new RpcResult(new JSONObject(map).toJSONString());
    }

}
