添加aop属性：
spring.aop.proxy-target-class=true
spring.aop.auto=true

SystemControllerLogAspect:切面记录用户的操作方法的行为轨迹
具体处理暂时先把数据落到mongo

自定义注解：SystemControllerLog
两个方法：
String method() default "";
String desc() default "";



使用时只需在需要的controller上加上注解：SystemControllerLog，定义好方法名和注释即可

