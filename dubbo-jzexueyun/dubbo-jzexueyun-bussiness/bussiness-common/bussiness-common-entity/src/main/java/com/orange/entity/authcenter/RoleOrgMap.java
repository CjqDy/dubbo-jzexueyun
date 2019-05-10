package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_role_org_map
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class RoleOrgMap implements Serializable {
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
     * 机构（学校）Id
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "机构（学校）Id：{Length}")
    @JsonProperty(value="ORG_ID")
    private String orgId;

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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", orgId=").append(orgId);
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
        RoleOrgMap other = (RoleOrgMap) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        return result;
    }

    public void copyProperties(RoleOrgMap target) {
        target.setId(getId());
        target.setRoleId(getRoleId());
        target.setOrgId(getOrgId());
    }
}