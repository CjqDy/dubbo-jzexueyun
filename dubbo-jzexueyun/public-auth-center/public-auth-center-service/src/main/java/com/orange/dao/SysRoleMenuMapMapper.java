package com.orange.dao;


import java.util.List;

import com.orange.entity.authcenter.SysRoleMenuMap;
import com.orange.entity.authcenter.SysRoleMenuMapExample;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapMapper {
    long countByExample(SysRoleMenuMapExample example);

    int deleteByExample(SysRoleMenuMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysRoleMenuMap record);

    int insertSelective(SysRoleMenuMap record);

    List<SysRoleMenuMap> selectByExample(SysRoleMenuMapExample example);

    SysRoleMenuMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysRoleMenuMap record, @Param("example") SysRoleMenuMapExample example);

    int updateByExample(@Param("record") SysRoleMenuMap record, @Param("example") SysRoleMenuMapExample example);

    int updateByPrimaryKeySelective(SysRoleMenuMap record);

    int updateByPrimaryKey(SysRoleMenuMap record);
}