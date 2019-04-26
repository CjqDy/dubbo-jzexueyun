package com.orange.service.impl;

import com.orange.auth.service.SysRoleService;
import com.orange.dao.SysRoleMapper;
import com.orange.entity.authcenter.SysRole;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/26 10:47
 **/
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public SysRole getSysRole(String roleId) throws Exception {
        return sysRoleMapper.selectByPrimaryKey(roleId);
    }
}
