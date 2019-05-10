package com.orange.dao;


import java.util.List;

import com.orange.entity.authcenter.RoleOrgMap;
import com.orange.entity.authcenter.RoleOrgMapExample;
import org.apache.ibatis.annotations.Param;

public interface RoleOrgMapMapper {
    long countByExample(RoleOrgMapExample example);

    int deleteByExample(RoleOrgMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleOrgMap record);

    int insertSelective(RoleOrgMap record);

    List<RoleOrgMap> selectByExample(RoleOrgMapExample example);

    RoleOrgMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleOrgMap record, @Param("example") RoleOrgMapExample example);

    int updateByExample(@Param("record") RoleOrgMap record, @Param("example") RoleOrgMapExample example);

    int updateByPrimaryKeySelective(RoleOrgMap record);

    int updateByPrimaryKey(RoleOrgMap record);
}