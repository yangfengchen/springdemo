package com.sfpy.dao.usersystem;

import com.sfpy.entity.usersystem.TblUser;

import java.util.List;

public interface TblUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TblUser record);

    int insertSelective(TblUser record);

    TblUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblUser record);

    int updateByPrimaryKey(TblUser record);

    List<TblUser> selectAll();
}