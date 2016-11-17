package com.sfpy.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/11/16.
 */
@ControllerAdvice
public class WebExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(WebExceptionHandler.class);

    //数据库操作失败
    @ExceptionHandler(DataAccessException.class)
    public String DataAccessException(DataAccessException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //调用了未经初始化的对象或者是不存在的对象
    @ExceptionHandler(NullPointerException.class)
    public String NullPointerException(NullPointerException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //IO异常
    @ExceptionHandler(IOException.class)
    public String IOException(IOException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //指定的类不存在
    @ExceptionHandler(ClassNotFoundException.class)
    public String ClassNotFoundException(ClassNotFoundException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //数学运算异常
    @ExceptionHandler(ArithmeticException.class)
    public String ArithmeticException(ArithmeticException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //数组下标越界
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public String ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //方法的参数错误
    @ExceptionHandler(IllegalArgumentException.class)
    public String IllegalArgumentException(IllegalArgumentException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //方法的参数错误
    @ExceptionHandler(ClassCastException.class)
    public String ClassCastException(ClassCastException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //违背安全原则异常
    @ExceptionHandler(SecurityException.class)
    public String SecurityException(SecurityException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //操作数据库异常
    @ExceptionHandler(SQLException.class)
    public String SQLException(SQLException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //方法末找到异常
    @ExceptionHandler(NoSuchMethodError.class)
    public String NoSuchMethodError(NoSuchMethodError ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //jvm内部错误
    @ExceptionHandler(InternalError.class)
    public String InternalError(InternalError ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //其他异常
    @ExceptionHandler(Exception.class)
    public String Exception(Exception ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }




}
