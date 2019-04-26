package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_sys_user_role_map
 * @author MyBatis Generator 
 * @date 2019/04/26
 */
public class SysUserRoleMap implements Serializable {
    /**
     * ID
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "ID：{Length}")
    @JsonProperty(value="P_ID")
    private String pId;

    /**
     * 角色ID
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "角色ID：{Length}")
    @JsonProperty(value="F_ROLE_ID")
    private String fRoleId;

    /**
     * 角色类型（由于和角色表冲突，该字段废弃。---1：系统预定角色，不允许修改）
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "角色类型（由于和角色表冲突，该字段废弃。---1：系统预定角色，不允许修改）：{Length}")
    @JsonProperty(value="S_TYPE")
    private String sType;

    /**
     * 用户ID
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "用户ID：{Length}")
    @JsonProperty(value="F_ORGUSER_ID")
    private String fOrguserId;

    private static final long serialVersionUID = 1L;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getfRoleId() {
        return fRoleId;
    }

    public void setfRoleId(String fRoleId) {
        this.fRoleId = fRoleId;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getfOrguserId() {
        return fOrguserId;
    }

    public void setfOrguserId(String fOrguserId) {
        this.fOrguserId = fOrguserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", fRoleId=").append(fRoleId);
        sb.append(", sType=").append(sType);
        sb.append(", fOrguserId=").append(fOrguserId);
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
        SysUserRoleMap other = (SysUserRoleMap) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getfRoleId() == null ? other.getfRoleId() == null : this.getfRoleId().equals(other.getfRoleId()))
            && (this.getsType() == null ? other.getsType() == null : this.getsType().equals(other.getsType()))
            && (this.getfOrguserId() == null ? other.getfOrguserId() == null : this.getfOrguserId().equals(other.getfOrguserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getfRoleId() == null) ? 0 : getfRoleId().hashCode());
        result = prime * result + ((getsType() == null) ? 0 : getsType().hashCode());
        result = prime * result + ((getfOrguserId() == null) ? 0 : getfOrguserId().hashCode());
        return result;
    }

    public void copyProperties(SysUserRoleMap target) {
        target.setpId(getpId());
        target.setfRoleId(getfRoleId());
        target.setsType(getsType());
        target.setfOrguserId(getfOrguserId());
    }
}