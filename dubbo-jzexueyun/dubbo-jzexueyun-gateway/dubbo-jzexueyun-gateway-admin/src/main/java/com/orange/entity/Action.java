package com.orange.entity;

import java.util.StringJoiner;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/24 11:22
 **/
public class Action {

    private String actionMethod;

    private String actionDes;

    private String actionType;

    private String actionIp;

    private String userId;

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
