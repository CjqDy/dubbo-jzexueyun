package com.orange.dao;

import java.util.List;

import com.orange.entity.authcenter.MenuButtonMap;
import com.orange.entity.authcenter.MenuButtonMapExample;
import org.apache.ibatis.annotations.Param;

public interface MenuButtonMapMapper {
    long countByExample(MenuButtonMapExample example);

    int deleteByExample(MenuButtonMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(MenuButtonMap record);

    int insertSelective(MenuButtonMap record);

    List<MenuButtonMap> selectByExample(MenuButtonMapExample example);

    MenuButtonMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MenuButtonMap record, @Param("example") MenuButtonMapExample example);

    int updateByExample(@Param("record") MenuButtonMap record, @Param("example") MenuButtonMapExample example);

    int updateByPrimaryKeySelective(MenuButtonMap record);

    int updateByPrimaryKey(MenuButtonMap record);
}