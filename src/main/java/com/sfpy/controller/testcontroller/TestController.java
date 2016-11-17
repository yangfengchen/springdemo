package com.sfpy.controller.usersystem;

import com.sfpy.service.testservice.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/13.
 */
@Controller
public class TestController {

    private static  final Logger log = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestService testService;

    @RequestMapping(value = "testIndexValue.htm")
    @ResponseBody
    private Map<String,Object> testIndexValue(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        return resultMap;
    }

    @RequestMapping(value = "testIndex.htm")
    private String testIndex(HttpServletRequest request, HttpServletResponse response){
       testService.testException();
        return "/index";
    }
}
