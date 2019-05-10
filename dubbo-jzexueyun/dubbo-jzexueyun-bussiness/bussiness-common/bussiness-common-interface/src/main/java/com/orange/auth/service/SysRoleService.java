package com.orange.auth.service;

import com.orange.entity.authcenter.Role;

import java.io.IOException;
import java.util.List;

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
    Role getSysRole(String roleId) throws IOException;

    List<Role> selectByExample()throws IOException;
}
