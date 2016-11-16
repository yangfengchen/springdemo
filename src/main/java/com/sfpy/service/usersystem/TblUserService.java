package com.sfpy.service.usersystem;

import com.sfpy.entity.usersystem.TblUser;
import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
public interface TblUserService {

    List<TblUser> selectAll();

    int insert();

}
