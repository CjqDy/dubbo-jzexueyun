package com.orange.entity.authcenter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * t_menu
 * @author MyBatis Generator 
 * @date 2019/05/10
 */
public class Menu implements Serializable {
    /**
     * 主键（菜单Id,自动生成）
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "主键（菜单Id,自动生成）：{Length}")
    @JsonProperty(value="ID")
    private String id;

    /**
     * 菜单名称
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "菜单名称：{Length}")
    @JsonProperty(value="MENU_NAME")
    private String menuName;

    /**
     * 描述
     */
    @org.hibernate.validator.constraints.Length(max = 50, message = "描述：{Length}")
    @JsonProperty(value="MENU_DESC")
    private String menuDesc;

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
    @JsonProperty(value="PARENT_ID")
    private String parentId;

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

    /**
     * 系统ID
     */
    @org.hibernate.validator.constraints.Length(max = 20, message = "系统ID：{Length}")
    @JsonProperty(value="SYSTEM_ID")
    private String systemId;

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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
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
        sb.append(", menuName=").append(menuName);
        sb.append(", menuDesc=").append(menuDesc);
        sb.append(", url=").append(url);
        sb.append(", parentId=").append(parentId);
        sb.append(", enabled=").append(enabled);
        sb.append(", allowShare=").append(allowShare);
        sb.append(", systemId=").append(systemId);
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
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuDesc() == null ? other.getMenuDesc() == null : this.getMenuDesc().equals(other.getMenuDesc()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getAllowShare() == null ? other.getAllowShare() == null : this.getAllowShare().equals(other.getAllowShare()))
            && (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuDesc() == null) ? 0 : getMenuDesc().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getAllowShare() == null) ? 0 : getAllowShare().hashCode());
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    public void copyProperties(Menu target) {
        target.setId(getId());
        target.setMenuName(getMenuName());
        target.setMenuDesc(getMenuDesc());
        target.setUrl(getUrl());
        target.setParentId(getParentId());
        target.setEnabled(getEnabled());
        target.setAllowShare(getAllowShare());
        target.setSystemId(getSystemId());
        target.setIsdelete(getIsdelete());
    }
}