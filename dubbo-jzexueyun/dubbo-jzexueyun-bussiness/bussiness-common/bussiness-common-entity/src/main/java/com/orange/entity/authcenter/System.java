package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class System implements Serializable {
    /**
     * 主键（系统Id,自动生成）
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "主键（系统Id,自动生成）：{Length}")
    @JsonProperty(value="ID")
    private String id;

    /**
     * 系统名称
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "系统名称：{Length}")
    @JsonProperty(value="SYS_NAME")
    private String sysName;

    /**
     * 系统描述
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "系统描述：{Length}")
    @JsonProperty(value="SYS_DESC")
    private String sysDesc;

    /**
     * 创建时间
     */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = com.orange.common.util.DateUtil.DATE_FORMAT_DEFAULT, timezone = com.orange.common.util.DateUtil.TIME_ZONE_CN)
    @JsonProperty(value="CREATE_TIME")
    private Date createTime;

    /**
     * 创建人Id
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "创建人Id：{Length}")
    @JsonProperty(value="CREATOR")
    private String creator;

    /**
     * 是否删除(1:是，0:否)
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "是否删除(1:是，0:否)：{Length}")
    @JsonProperty(value="ISDELETE")
    private String isdelete;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysName=").append(sysName);
        sb.append(", sysDesc=").append(sysDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", isdelete=").append(isdelete);
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
        System other = (System) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSysName() == null ? other.getSysName() == null : this.getSysName().equals(other.getSysName()))
            && (this.getSysDesc() == null ? other.getSysDesc() == null : this.getSysDesc().equals(other.getSysDesc()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSysName() == null) ? 0 : getSysName().hashCode());
        result = prime * result + ((getSysDesc() == null) ? 0 : getSysDesc().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    public void copyProperties(System target) {
        target.setId(getId());
        target.setSysName(getSysName());
        target.setSysDesc(getSysDesc());
        target.setCreateTime(getCreateTime());
        target.setCreator(getCreator());
        target.setIsdelete(getIsdelete());
    }
}