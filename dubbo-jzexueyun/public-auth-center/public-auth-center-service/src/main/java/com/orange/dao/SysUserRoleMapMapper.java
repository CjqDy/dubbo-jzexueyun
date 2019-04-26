package com.orange.dao;


import com.orange.entity.authcenter.SysUserRoleMap;
import com.orange.entity.authcenter.SysUserRoleMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserRoleMapMapper {
    long countByExample(SysUserRoleMapExample example);

    int deleteByExample(SysUserRoleMapExample example);

    int deleteByPrimaryKey(String pId);

    int insert(SysUserRoleMap record);

    int insertSelective(SysUserRoleMap record);

    List<SysUserRoleMap> selectByExample(SysUserRoleMapExample example);

    SysUserRoleMap selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") SysUserRoleMap record, @Param("example") SysUserRoleMapExample example);

    int updateByExample(@Param("record") SysUserRoleMap record, @Param("example") SysUserRoleMapExample example);

    int updateByPrimaryKeySelective(SysUserRoleMap record);

    int updateByPrimaryKey(SysUserRoleMap record);
}