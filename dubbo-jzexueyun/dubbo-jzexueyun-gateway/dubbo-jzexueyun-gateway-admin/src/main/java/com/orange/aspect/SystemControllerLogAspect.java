package com.orange.aspect;

import com.orange.common.util.DateUtil;
import com.orange.common.util.SessionLocalUtil;
import com.orange.common.util.UserInfo;
import com.orange.entity.Action;
import com.orange.log.aop.SystemControllerLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.eclipse.core.internal.resources.LinkDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: dubbo-jzexueyun
 * @description: SystemControllerLogAspect
 * @author: chengjiaqi
 * @create: 2019/04/24 10:38
 **/
@Aspect
@Component
@SuppressWarnings("all")
public class SystemControllerLogAspect {


    //本地异常日志记录对象
    private static final Logger logger = LoggerFactory.getLogger(SystemControllerLogAspect.class);

    //收集Action对象
    private List<Action> list = new LinkedList<Action>();

    private List<Action> res = new LinkedList<Action>();

    //集合中满50条数据处理
    private final int number = 5;
    //设置超时时间为10秒
    private final long time = 10000;

    //记录最后一次上传时间
    private Date date = new Date();

    @Resource
    private AsyncData asyncData;


    //Controller层切点
    @Pointcut("@annotation(com.orange.log.aop.SystemControllerLog)")
    public void controllerAspect() {
    }

    /**
     * @Description 前置通知  用于拦截Controller层记录用户的操作
     * @date 2018年9月3日 10:38
     */

    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        //读取session中的用户
        UserInfo userInfo = SessionLocalUtil.getUser();

        String ip = getIpAddr(request);

        try {
            Action action = new Action();
            action.setActionMethod(joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName());
            action.setActionDes(getControllerMethodDescription(joinPoint));
            action.setActionType("0");
            action.setActionIp(ip);
            action.setUserId(userInfo.getUserId());
            action.setActionTime(DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
            synchronized (this) {
                list.add(action);
                System.out.println("size :" + list.size());
                //1.达到处理的条数  2.比较上一条超过超时间 ，立即处理
                if (number == list.size() || ((new Date().getTime() - date.getTime()) > time) && list.size() > 1) {
                    res = list;
                    date = new Date();
//                    TODO:处理集合数据
                    asyncData.dataToMongo(res);
                    list.clear();
                } else {
                    date = new Date();
                }

            }


        } catch (Exception e) {
            //记录本地异常日志
            logger.error("==前置通知异常==");
            logger.error("异常信息：{}", e.getMessage());
        }
    }


    /**
     * @author changyaofang
     * @Description 获取注解中对方法的描述信息 用于Controller层注解
     * @date 2018年9月3日 上午12:01
     */
    public static String getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();//目标方法名
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(SystemControllerLog.class).desc();
                    break;
                }
            }
        }
        return description;
    }


    /**
     * 获取IP地址
     *
     * @param request
     * @return
     */
    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }


}
