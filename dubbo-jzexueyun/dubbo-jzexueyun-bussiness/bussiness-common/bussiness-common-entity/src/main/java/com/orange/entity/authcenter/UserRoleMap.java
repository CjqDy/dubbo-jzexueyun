package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_user_role_map
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class UserRoleMap implements Serializable {
    /**
     * 主键
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "主键：{Length}")
    @JsonProperty(value="ID")
    private String id;

    /**
     * 角色ID
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "角色ID：{Length}")
    @JsonProperty(value="ROLE_ID")
    private String roleId;

    /**
     * 用户ID
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "用户ID：{Length}")
    @JsonProperty(value="USER_ID")
    private String userId;

    /**
     * 是否为选中角色（0 不是  1 是）
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "是否为选中角色（0 不是  1 是）：{Length}")
    @JsonProperty(value="ISDEFAULT")
    private String isdefault;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", userId=").append(userId);
        sb.append(", isdefault=").append(isdefault);
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
        UserRoleMap other = (UserRoleMap) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIsdefault() == null ? other.getIsdefault() == null : this.getIsdefault().equals(other.getIsdefault()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIsdefault() == null) ? 0 : getIsdefault().hashCode());
        return result;
    }

    public void copyProperties(UserRoleMap target) {
        target.setId(getId());
        target.setRoleId(getRoleId());
        target.setUserId(getUserId());
        target.setIsdefault(getIsdefault());
    }
}