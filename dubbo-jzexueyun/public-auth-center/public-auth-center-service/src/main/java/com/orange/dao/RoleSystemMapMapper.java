package com.orange.dao;


import java.util.List;

import com.orange.entity.authcenter.RoleSystemMap;
import com.orange.entity.authcenter.RoleSystemMapExample;
import org.apache.ibatis.annotations.Param;

public interface RoleSystemMapMapper {
    long countByExample(RoleSystemMapExample example);

    int deleteByExample(RoleSystemMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleSystemMap record);

    int insertSelective(RoleSystemMap record);

    List<RoleSystemMap> selectByExample(RoleSystemMapExample example);

    RoleSystemMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleSystemMap record, @Param("example") RoleSystemMapExample example);

    int updateByExample(@Param("record") RoleSystemMap record, @Param("example") RoleSystemMapExample example);

    int updateByPrimaryKeySelective(RoleSystemMap record);

    int updateByPrimaryKey(RoleSystemMap record);
}