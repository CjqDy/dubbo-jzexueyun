package com.orange.auth.service;

import com.orange.entity.authcenter.SysRole;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: Mr.Wang
 * @create: 2019/04/26 10:44
 **/
public interface SysRoleService {

    /**
     * 获得角色.
     *
     * @param roleId roleId
     * @return the sys role
     * @throws Exception the exception
     */
    SysRole getSysRole(String roleId) throws Exception;
}
