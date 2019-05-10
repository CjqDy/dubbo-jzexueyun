package com.orange.dao;


import java.util.List;

import com.orange.entity.authcenter.RoleMenuButtonMap;
import com.orange.entity.authcenter.RoleMenuButtonMapExample;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuButtonMapMapper {
    long countByExample(RoleMenuButtonMapExample example);

    int deleteByExample(RoleMenuButtonMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleMenuButtonMap record);

    int insertSelective(RoleMenuButtonMap record);

    List<RoleMenuButtonMap> selectByExample(RoleMenuButtonMapExample example);

    RoleMenuButtonMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleMenuButtonMap record, @Param("example") RoleMenuButtonMapExample example);

    int updateByExample(@Param("record") RoleMenuButtonMap record, @Param("example") RoleMenuButtonMapExample example);

    int updateByPrimaryKeySelective(RoleMenuButtonMap record);

    int updateByPrimaryKey(RoleMenuButtonMap record);
}