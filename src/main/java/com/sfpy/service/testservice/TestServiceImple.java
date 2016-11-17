package com.sfpy.service.testservice;

import com.sfpy.dao.usersystem.TblUserMapper;
import com.sfpy.entity.usersystem.TblUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
@Service
public class TestServiceImple implements TestService{

    @Autowired
    private TblUserMapper tblUserMapper;


    public List<TblUser> selectAll() {
        return tblUserMapper.selectAll();
    }

    public int insert() {
        TblUser tblUser = new TblUser();
        tblUser.setId("22");
        tblUser.setAlias("dd");
        int count = tblUserMapper.insert(tblUser);
        System.out.println(count);
        int i = 1/0;
        System.out.println(i);
        return count;
    }

    public int testException() {
        int i = 1/0;
        return 0;
    }

}
