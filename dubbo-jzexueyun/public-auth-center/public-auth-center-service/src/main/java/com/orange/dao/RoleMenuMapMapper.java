package com.orange.dao;


import java.util.List;

import com.orange.entity.authcenter.RoleMenuMap;
import com.orange.entity.authcenter.RoleMenuMapExample;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapMapper {
    long countByExample(RoleMenuMapExample example);

    int deleteByExample(RoleMenuMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleMenuMap record);

    int insertSelective(RoleMenuMap record);

    List<RoleMenuMap> selectByExample(RoleMenuMapExample example);

    RoleMenuMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleMenuMap record, @Param("example") RoleMenuMapExample example);

    int updateByExample(@Param("record") RoleMenuMap record, @Param("example") RoleMenuMapExample example);

    int updateByPrimaryKeySelective(RoleMenuMap record);

    int updateByPrimaryKey(RoleMenuMap record);
}