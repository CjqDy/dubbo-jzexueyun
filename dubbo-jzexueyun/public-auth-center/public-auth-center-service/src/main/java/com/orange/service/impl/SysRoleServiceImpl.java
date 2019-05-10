package com.orange.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.orange.auth.service.SysRoleService;
import com.orange.dao.RoleMapper;
import com.orange.entity.authcenter.Role;
import com.orange.entity.authcenter.RoleExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * @program: dubbo-jzexueyun
 * @description:
 * @author: chengjiaqi
 * @create: 2019/04/26 10:47
 **/
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Role getSysRole(String roleId) throws IOException {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public List<Role> selectByExample() {
        RoleExample example = new RoleExample();
        List<Role> list = roleMapper.selectByExample(example);
        return list;
    }
}
