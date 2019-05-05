dubbo 2.6.6 + nacos 0.0.1

待apache dubbo 2.7.x  适配好后 再升级

+ 基础网关（业务请求拦截（统一入口，实现登录权限认证） sessionFilter + 协议转换（待完善）+ 数据聚合）
+ sentinel(flow rule 和 degrade rule 降级)
+ 用户行为日志filter（注解@SystemControllerLog）
后续引入seata 分布式事物（解决支付，第三方对接等问题）


第一阶段：
完成auth center 的基础业务开发（注意权限升级到功能权限）
sessionFilter 鉴权（包括信息认证和用户安全信息处理）
对外统一鉴权中心（仿照开放平台的设计逻辑）


Nacos配置中心：
引入nacos 配置文件/注解：
nacos配置中心地址，配置文件dataId,驱动类
<nacos:global-properties server-addr="localhost:8848" />
<nacos:property-source data-id="nacos-consumer-application.properties" first="true" auto-refreshed="true" />
<nacos:annotation-driven ></nacos:annotation-driven>

使用的几种方式
1.@NacosValue(value="dataId",autoRefreshed = true)   #autoRefreshed不加这个貌似没法更新
2.nacosFactroy读取配置属性 实现NacosAutoConfigCenter接口
3.注解@NacosConfigListener 配置监听