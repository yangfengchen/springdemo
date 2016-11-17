package com.sfpy.service;

import com.sfpy.entity.usersystem.TblUser;

import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
public interface TestService {

    List<TblUser> selectAll();

    int insert();

    int testException();

}
