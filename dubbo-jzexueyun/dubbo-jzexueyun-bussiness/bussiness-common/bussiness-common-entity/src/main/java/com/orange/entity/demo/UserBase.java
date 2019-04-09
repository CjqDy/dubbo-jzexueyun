package com.orange.entity.demo;





import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_user_base
 * @author MyBatis Generator 
 * @date 2018/09/20
 */
public class UserBase implements Serializable {
    /**
     * 主键（用户Id）
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "主键（用户Id）：{Length}")
    @JsonProperty(value="P_ID")
    private String pId;

    /**
     * 手机号
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "手机号：{Length}")
    @JsonProperty(value="S_PHONE")
    private String sPhone;

    /**
     * 密码
     */
    @org.hibernate.validator.constraints.Length(max = 255, message = "密码：{Length}")
    @JsonProperty(value="S_PASSWORD")
    private String sPassword;

    private static final long serialVersionUID = 1L;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", sPhone=").append(sPhone);
        sb.append(", sPassword=").append(sPassword);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserBase other = (UserBase) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getsPhone() == null ? other.getsPhone() == null : this.getsPhone().equals(other.getsPhone()))
            && (this.getsPassword() == null ? other.getsPassword() == null : this.getsPassword().equals(other.getsPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getsPhone() == null) ? 0 : getsPhone().hashCode());
        result = prime * result + ((getsPassword() == null) ? 0 : getsPassword().hashCode());
        return result;
    }

    public void copyProperties(UserBase target) {
        target.setpId(getpId());
        target.setsPhone(getsPhone());
        target.setsPassword(getsPassword());
    }
}