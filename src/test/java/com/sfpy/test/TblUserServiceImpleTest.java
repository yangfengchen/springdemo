package com.sfpy.test;

import com.alibaba.fastjson.JSON;
import com.sfpy.entity.usersystem.TblUser;
import com.sfpy.service.TestService;
import com.sfpy.service.usersystem.TblUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
@Transactional
@Rollback(false)
public class TblUserServiceImpleTest  extends AbstractJUnit4SpringContextTests {

    @Resource
    private TblUserService tblUserService;

    @Resource
    private TestService testService;

    @Test
    public void insert(){
        //tblUserService.insert();
        testService.insert();
    }

    @Test
    public void selectAll(){
       /* List<TblUser> tblUser = tblUserService.selectAll();
        System.out.println(JSON.toJSONString(tblUser));*/
        List<TblUser> tblUser = testService.selectAll();
        System.out.println(JSON.toJSONString(tblUser));
    }

}