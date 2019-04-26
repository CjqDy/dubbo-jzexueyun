package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * t_sys_role
 * @author MyBatis Generator 
 * @date 2019/04/26
 */
public class SysRole implements Serializable {
    /**
     * ID
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "ID：{Length}")
    @JsonProperty(value="P_ID")
    private String pId;

    /**
     * 系统编码
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "系统编码：{Length}")
    @JsonProperty(value="F_SYSTEM_ID")
    private String fSystemId;

    /**
     * 角色名称
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "角色名称：{Length}")
    @JsonProperty(value="S_NAME")
    private String sName;

    /**
     * 角色描述
     */
    @org.hibernate.validator.constraints.Length(max = 255, message = "角色描述：{Length}")
    @JsonProperty(value="S_DESC")
    private String sDesc;

    /**
     * 角色类型(2：管理员（拥有所有菜单），1：自定义角色，5：班主任)
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "角色类型(2：管理员（拥有所有菜单），1：自定义角色，5：班主任)：{Length}")
    @JsonProperty(value="S_TYPE")
    private String sType;

    /**
     * 创建人
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "创建人：{Length}")
    @JsonProperty(value="S_CREATOR")
    private String sCreator;

    /**
     * 创建时间
     */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = com.orange.common.util.DateUtil.DATE_FORMAT_DEFAULT, timezone = com.orange.common.util.DateUtil.TIME_ZONE_CN)
    @JsonProperty(value="S_CREATER_TIME")
    private Date sCreaterTime;

    /**
     * 更新时间
     */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = com.orange.common.util.DateUtil.DATE_FORMAT_DEFAULT, timezone = com.orange.common.util.DateUtil.TIME_ZONE_CN)
    @JsonProperty(value="S_UPDATE_TIME")
    private Date sUpdateTime;

    /**
     * 更新人
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "更新人：{Length}")
    @JsonProperty(value="S_UPDATER")
    private String sUpdater;

    /**
     * 机构ID（代理商的机构ID是代理商ID，学校的机构ID是学校ID，橘子公司的ID是0）
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "机构ID（代理商的机构ID是代理商ID，学校的机构ID是学校ID，橘子公司的ID是0）：{Length}")
    @JsonProperty(value="INST_ID")
    private String instId;

    private static final long serialVersionUID = 1L;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getfSystemId() {
        return fSystemId;
    }

    public void setfSystemId(String fSystemId) {
        this.fSystemId = fSystemId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getsCreator() {
        return sCreator;
    }

    public void setsCreator(String sCreator) {
        this.sCreator = sCreator;
    }

    public Date getsCreaterTime() {
        return sCreaterTime;
    }

    public void setsCreaterTime(Date sCreaterTime) {
        this.sCreaterTime = sCreaterTime;
    }

    public Date getsUpdateTime() {
        return sUpdateTime;
    }

    public void setsUpdateTime(Date sUpdateTime) {
        this.sUpdateTime = sUpdateTime;
    }

    public String getsUpdater() {
        return sUpdater;
    }

    public void setsUpdater(String sUpdater) {
        this.sUpdater = sUpdater;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", fSystemId=").append(fSystemId);
        sb.append(", sName=").append(sName);
        sb.append(", sDesc=").append(sDesc);
        sb.append(", sType=").append(sType);
        sb.append(", sCreator=").append(sCreator);
        sb.append(", sCreaterTime=").append(sCreaterTime);
        sb.append(", sUpdateTime=").append(sUpdateTime);
        sb.append(", sUpdater=").append(sUpdater);
        sb.append(", instId=").append(instId);
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
        SysRole other = (SysRole) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getfSystemId() == null ? other.getfSystemId() == null : this.getfSystemId().equals(other.getfSystemId()))
            && (this.getsName() == null ? other.getsName() == null : this.getsName().equals(other.getsName()))
            && (this.getsDesc() == null ? other.getsDesc() == null : this.getsDesc().equals(other.getsDesc()))
            && (this.getsType() == null ? other.getsType() == null : this.getsType().equals(other.getsType()))
            && (this.getsCreator() == null ? other.getsCreator() == null : this.getsCreator().equals(other.getsCreator()))
            && (this.getsCreaterTime() == null ? other.getsCreaterTime() == null : this.getsCreaterTime().equals(other.getsCreaterTime()))
            && (this.getsUpdateTime() == null ? other.getsUpdateTime() == null : this.getsUpdateTime().equals(other.getsUpdateTime()))
            && (this.getsUpdater() == null ? other.getsUpdater() == null : this.getsUpdater().equals(other.getsUpdater()))
            && (this.getInstId() == null ? other.getInstId() == null : this.getInstId().equals(other.getInstId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getfSystemId() == null) ? 0 : getfSystemId().hashCode());
        result = prime * result + ((getsName() == null) ? 0 : getsName().hashCode());
        result = prime * result + ((getsDesc() == null) ? 0 : getsDesc().hashCode());
        result = prime * result + ((getsType() == null) ? 0 : getsType().hashCode());
        result = prime * result + ((getsCreator() == null) ? 0 : getsCreator().hashCode());
        result = prime * result + ((getsCreaterTime() == null) ? 0 : getsCreaterTime().hashCode());
        result = prime * result + ((getsUpdateTime() == null) ? 0 : getsUpdateTime().hashCode());
        result = prime * result + ((getsUpdater() == null) ? 0 : getsUpdater().hashCode());
        result = prime * result + ((getInstId() == null) ? 0 : getInstId().hashCode());
        return result;
    }

    public void copyProperties(SysRole target) {
        target.setpId(getpId());
        target.setfSystemId(getfSystemId());
        target.setsName(getsName());
        target.setsDesc(getsDesc());
        target.setsType(getsType());
        target.setsCreator(getsCreator());
        target.setsCreaterTime(getsCreaterTime());
        target.setsUpdateTime(getsUpdateTime());
        target.setsUpdater(getsUpdater());
        target.setInstId(getInstId());
    }
}