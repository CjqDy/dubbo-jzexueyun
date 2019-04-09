package com.orange.dao;

import com.orange.entity.demo.UserBase;
import com.orange.entity.demo.UserBaseExample;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;


public interface UserBaseMapper {
    long countByExample(UserBaseExample example);

    int deleteByExample(UserBaseExample example);

    int deleteByPrimaryKey(String pId);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    List<UserBase> selectByExample(UserBaseExample example);

    UserBase selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    int updateByExample(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);
}