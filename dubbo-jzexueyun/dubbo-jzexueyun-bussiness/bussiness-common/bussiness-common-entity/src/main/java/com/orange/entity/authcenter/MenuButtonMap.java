package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_menu_button_map
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class MenuButtonMap implements Serializable {
    /**
     * 主键（按钮（页面）Id,自动生成）
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "主键（按钮（页面）Id,自动生成）：{Length}")
    @JsonProperty(value="ID")
    private String id;

    /**
     * 菜单名称
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "菜单名称：{Length}")
    @JsonProperty(value="BUTTON_NAME")
    private String buttonName;

    /**
     * 描述
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "描述：{Length}")
    @JsonProperty(value="BUTTON_DESC")
    private String buttonDesc;

    /**
     * 菜单路径
     */
    @org.hibernate.validator.constraints.Length(max = 255, message = "菜单路径：{Length}")
    @JsonProperty(value="URL")
    private String url;

    /**
     * 父菜单ID
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "父菜单ID：{Length}")
    @JsonProperty(value="MENU_ID")
    private String menuId;

    /**
     * 是否启用(1:是，0:否)
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "是否启用(1:是，0:否)：{Length}")
    @JsonProperty(value="ENABLED")
    private String enabled;

    /**
     * 是否允许分配给别人(1:是，0:否)
     */
    @org.hibernate.validator.constraints.Length(max = 1, message = "是否允许分配给别人(1:是，0:否)：{Length}")
    @JsonProperty(value="ALLOW_SHARE")
    private String allowShare;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonDesc() {
        return buttonDesc;
    }

    public void setButtonDesc(String buttonDesc) {
        this.buttonDesc = buttonDesc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getAllowShare() {
        return allowShare;
    }

    public void setAllowShare(String allowShare) {
        this.allowShare = allowShare;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", buttonName=").append(buttonName);
        sb.append(", buttonDesc=").append(buttonDesc);
        sb.append(", url=").append(url);
        sb.append(", menuId=").append(menuId);
        sb.append(", enabled=").append(enabled);
        sb.append(", allowShare=").append(allowShare);
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
        MenuButtonMap other = (MenuButtonMap) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getButtonName() == null ? other.getButtonName() == null : this.getButtonName().equals(other.getButtonName()))
            && (this.getButtonDesc() == null ? other.getButtonDesc() == null : this.getButtonDesc().equals(other.getButtonDesc()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getAllowShare() == null ? other.getAllowShare() == null : this.getAllowShare().equals(other.getAllowShare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getButtonName() == null) ? 0 : getButtonName().hashCode());
        result = prime * result + ((getButtonDesc() == null) ? 0 : getButtonDesc().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getAllowShare() == null) ? 0 : getAllowShare().hashCode());
        return result;
    }

    public void copyProperties(MenuButtonMap target) {
        target.setId(getId());
        target.setButtonName(getButtonName());
        target.setButtonDesc(getButtonDesc());
        target.setUrl(getUrl());
        target.setMenuId(getMenuId());
        target.setEnabled(getEnabled());
        target.setAllowShare(getAllowShare());
    }
}