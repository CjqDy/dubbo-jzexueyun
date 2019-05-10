package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_role_menu_button_map
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class RoleMenuButtonMap implements Serializable {
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
     * 菜单ID
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "菜单ID：{Length}")
    @JsonProperty(value="MENU_ID")
    private String menuId;

    /**
     * 菜单ID
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "菜单ID：{Length}")
    @JsonProperty(value="BUTTON_ID")
    private String buttonId;

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

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", buttonId=").append(buttonId);
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
        RoleMenuButtonMap other = (RoleMenuButtonMap) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getButtonId() == null ? other.getButtonId() == null : this.getButtonId().equals(other.getButtonId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getButtonId() == null) ? 0 : getButtonId().hashCode());
        return result;
    }

    public void copyProperties(RoleMenuButtonMap target) {
        target.setId(getId());
        target.setRoleId(getRoleId());
        target.setMenuId(getMenuId());
        target.setButtonId(getButtonId());
    }
}