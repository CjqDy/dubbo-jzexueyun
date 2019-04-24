package com.orange.common.util;

import java.io.Serializable;

/**
 * @program: dubbo-jzexueyun
 * @description: UserInfo
 * @author: chengjiaqi
 * @create: 2019/04/24 11:28
 **/
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String userName;
    private String exueCode;
    private String phone;
    private String deviceType;
    /**
     * 用户头像
     */
    private String userPic;

    public UserInfo() {
    }

    public UserInfo(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public UserInfo(String userId, String userName, String userPic) {
        this.userId = userId;
        this.userName = userName;
        this.userPic = userPic;
    }

    public UserInfo(String userId, String userName, String userPic,String exueCode) {
        this.userId = userId;
        this.userName = userName;
        this.userPic = userPic;
        this.exueCode = exueCode;
    }

    public UserInfo(String userId, String userName, String userPic,String exueCode,String phone,String deviceType) {
        this.userId = userId;
        this.userName = userName;
        this.userPic = userPic;
        this.exueCode = exueCode;
        this.phone = phone;
        this.deviceType = deviceType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }



    public String getExueCode() {
        return exueCode;
    }

    public void setExueCode(String exueCode) {
        this.exueCode = exueCode;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [");
        sb.append("userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPic=").append(userPic);
        sb.append(", exueCode=").append(exueCode);
        sb.append(", phone=").append(phone);
        sb.append(", deviceType=").append(deviceType);
        sb.append("]");
        return sb.toString();
    }
}
