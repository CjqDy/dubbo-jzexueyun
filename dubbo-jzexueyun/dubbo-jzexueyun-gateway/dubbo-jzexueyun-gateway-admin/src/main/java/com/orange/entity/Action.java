package com.orange.entity;

import java.util.StringJoiner;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/24 11:22
 **/
public class Action {

    private static final long serialVersionUID = -3258839839160856613L;

//    调用方法名
    private String actionMethod;
//    方法备注
    private String actionDes;

//    类型（默认为 0）
    private String actionType;

//    调用方Ip
    private String actionIp;

//    用户Id
    private String userId;

//    调用时间
    private String actionTime;

    public String getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod;
    }

    public String getActionDes() {
        return actionDes;
    }

    public void setActionDes(String actionDes) {
        this.actionDes = actionDes;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionIp() {
        return actionIp;
    }

    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Action.class.getSimpleName() + "[", "]")
                .add("actionMethod='" + actionMethod + "'")
                .add("actionDes='" + actionDes + "'")
                .add("actionType='" + actionType + "'")
                .add("actionIp='" + actionIp + "'")
                .add("userId='" + userId + "'")
                .add("actionTime='" + actionTime + "'")
                .toString();
    }
}
