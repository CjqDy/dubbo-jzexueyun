package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_role_system_map
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class RoleSystemMap implements Serializable {
    /**
     * 主键
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "主键：{Length}")
    @JsonProperty(value="ID")
    private String id;

    /**
     * 角色Id
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "角色Id：{Length}")
    @JsonProperty(value="ROLE_ID")
    private String roleId;

    /**
     * 系统Id
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "系统Id：{Length}")
    @JsonProperty(value="SYS_ID")
    private String sysId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", sysId=").append(sysId);
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
        RoleSystemMap other = (RoleSystemMap) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        return result;
    }

    public void copyProperties(RoleSystemMap target) {
        target.setId(getId());
        target.setRoleId(getRoleId());
        target.setSysId(getSysId());
    }
}