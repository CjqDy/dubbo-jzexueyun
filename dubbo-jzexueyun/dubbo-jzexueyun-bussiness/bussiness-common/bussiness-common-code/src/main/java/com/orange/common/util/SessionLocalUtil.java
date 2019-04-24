package com.orange.common.util;

import javax.servlet.ServletRequest;

/**
 * @program: dubbo-jzexueyun
 * @description: session会话信息缓存工具
 * @author: chengjiaqi
 * @create: 2019/04/24 11:27
 **/
public class SessionLocalUtil {

    private static ThreadLocal<UserInfo> userThreadLocal = new ThreadLocal<UserInfo>();

    private static ThreadLocal<ServletRequest> requestThreadLocal = new ThreadLocal<ServletRequest>();

    /**
     * 设置用户信息
     *
     * @param userInfo 用户
     */
    public static void setUser(UserInfo userInfo) {
        userThreadLocal.set(userInfo);
    }

    /**
     * 获取登录用户信息
     *
     * @return 用户
     */
    public static UserInfo getUser() {
        return userThreadLocal.get();
    }

    /**
     * 删除用户信息
     */
    public static void removeUser() {
        userThreadLocal.remove();
    }

    /**
     * 设置request
     *
     * @param request request
     */
    public static void setRequest(ServletRequest request) {
        requestThreadLocal.set(request);
    }

    /**
     * 获取request
     *
     * @return ServletRequest
     */
    public static ServletRequest getRequest() {
        return requestThreadLocal.get();
    }

    /**
     * 删除request
     */
    public static void removeRequest() {
        requestThreadLocal.remove();
    }
}
