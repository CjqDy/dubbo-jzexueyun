package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * t_role
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class Role implements Serializable {
    /**
     * 主键（角色Id,自动生成）
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "主键（角色Id,自动生成）：{Length}")
    @JsonProperty(value="ID")
    private String id;

    /**
     * 角色名称
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "角色名称：{Length}")
    @JsonProperty(value="ROLE_NAME")
    private String roleName;

    /**
     * 角色描述
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "角色描述：{Length}")
    @JsonProperty(value="ROLE_DESC")
    private String roleDesc;

    /**
     * 角色类型(0:系统默认角色 1:自定义角色)
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "角色类型(0:系统默认角色 1:自定义角色)：{Length}")
    @JsonProperty(value="TYPE")
    private String type;

    /**
     * 创建人Id
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "创建人Id：{Length}")
    @JsonProperty(value="CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = com.orange.common.util.DateUtil.DATE_FORMAT_DEFAULT, timezone = com.orange.common.util.DateUtil.TIME_ZONE_CN)
    @JsonProperty(value="CREATER_TIME")
    private Date createrTime;

    /**
     * 更新时间
     */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = com.orange.common.util.DateUtil.DATE_FORMAT_DEFAULT, timezone = com.orange.common.util.DateUtil.TIME_ZONE_CN)
    @JsonProperty(value="UPDATE_TIME")
    private Date updateTime;

    /**
     * 更新人Id
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "更新人Id：{Length}")
    @JsonProperty(value="UPDATER")
    private String updater;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
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
        sb.append(", roleName=").append(roleName);
        sb.append(", roleDesc=").append(roleDesc);
        sb.append(", type=").append(type);
        sb.append(", creator=").append(creator);
        sb.append(", createrTime=").append(createrTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updater=").append(updater);
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
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleDesc() == null ? other.getRoleDesc() == null : this.getRoleDesc().equals(other.getRoleDesc()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleDesc() == null) ? 0 : getRoleDesc().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    public void copyProperties(Role target) {
        target.setId(getId());
        target.setRoleName(getRoleName());
        target.setRoleDesc(getRoleDesc());
        target.setType(getType());
        target.setCreator(getCreator());
        target.setCreaterTime(getCreaterTime());
        target.setUpdateTime(getUpdateTime());
        target.setUpdater(getUpdater());
        target.setIsdelete(getIsdelete());
    }
}