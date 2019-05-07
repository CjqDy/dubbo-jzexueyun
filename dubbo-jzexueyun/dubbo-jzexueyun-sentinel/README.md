添加sentinel依赖
<dependency>
    <groupId>com.alibaba.csp</groupId>
    <artifactId>sentinel-dubbo-adapter</artifactId>
    <version>1.5.1</version>
</dependency>
<dependency>
    <groupId>com.alibaba.csp</groupId>
    <artifactId>sentinel-transport-simple-http</artifactId>
    <version>1.5.1</version>
</dependency>


添加公共处理类
SentinelControllerCenter
处理多线程并发控制和熔断降级

initFlowRule 和 initDegradeRule


添加系统配置文件:sentinel.properties 
加上需要处理的服务或者具体的方法，目前通过json统一配置


## type 0:多线程并发控制  1:：熔断降级
## sourceUri 配置的路径
## count 并发量或者超时时间
sentinel.demo =\
  [\
   {"sourceUri":"com.orange.demo.service.DemoService:sayHello()","type":"0","count":"10"},\
   {"sourceUri":"com.orange.demo.service.DemoService:sayHello3(java.lang.String)","type":"1","count":"200"} \
  ]
  
在服务启动前先初始化
SentinelControllerCenter sentinelControllerCenter = new SentinelControllerCenter(SentinelConstant.SENTINEL_DEMOS_SERVICE_METHOD);

抛出异常：SentinelRpcException  
ps：目前dubbo 捕获SentinelRpcException异常存在一些问题
    捕获RpcExcption异常
    
    
    If you are using Apache Dubbo 2.7.x and later version, you can add the following dependency:
    
    <dependency>
        <groupId>com.alibaba.csp</groupId>
        <artifactId>sentinel-apache-dubbo-adapter</artifactId>
        <version>x.y.z</version>
    </dependency>
    If you are using Dubbo 2.6.x or previous version, you can add the following dependency:
    
    <dependency>
        <groupId>com.alibaba.csp</groupId>
        <artifactId>sentinel-dubbo-adapter</artifactId>
        <version>x.y.z</version>
    </dependency>




