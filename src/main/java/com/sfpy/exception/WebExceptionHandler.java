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
    @ExceptionHandler(WebExceptionCommon.DATA_ACCESS_EXCEPTION_CLASS)
    public String DataAccessException(DataAccessException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //调用了未经初始化的对象或者是不存在的对象
    @ExceptionHandler(WebExceptionCommon.NULL_POINTER_EXCEPTION_CLASS)
    public String NullPointerException(NullPointerException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //IO异常
    @ExceptionHandler(WebExceptionCommon.IO_EXCEPTION_CLASS)
    public String IOException(IOException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //指定的类不存在
    @ExceptionHandler(WebExceptionCommon.CLASS_NOT_FOUND_EXCEPTION_CLASS)
    public String ClassNotFoundException(ClassNotFoundException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //数学运算异常
    @ExceptionHandler(WebExceptionCommon.ARITHMETIC_EXCEPTION_CLASS)
    public String ArithmeticException(ArithmeticException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //数组下标越界
    @ExceptionHandler(WebExceptionCommon.ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION_CLASS)
    public String ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //方法的参数错误
    @ExceptionHandler(WebExceptionCommon.ILLEGAL_ARGUMENT_EXCEPTION_CLASS)
    public String IllegalArgumentException(IllegalArgumentException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //方法的参数错误
    @ExceptionHandler(WebExceptionCommon.CLASS_CAST_EXCEPTION_CLASS)
    public String ClassCastException(ClassCastException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //违背安全原则异常
    @ExceptionHandler(WebExceptionCommon.SECURITY_EXCEPTION_CLASS)
    public String SecurityException(SecurityException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //操作数据库异常
    @ExceptionHandler(WebExceptionCommon.SQL_EXCEPTION_CLASS)
    public String SQLException(SQLException ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //方法末找到异常
    @ExceptionHandler(WebExceptionCommon.NO_SUCH_METHOD_ERROR_CLASS)
    public String NoSuchMethodError(NoSuchMethodError ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //jvm内部错误
    @ExceptionHandler(WebExceptionCommon.INTERNAL_ERROR_CLASS)
    public String InternalError(InternalError ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }

    //其他异常
    @ExceptionHandler(WebExceptionCommon.EXCEPTION_CLASS)
    public String Exception(Exception ex, HttpServletRequest request, HttpServletResponse response){
        log.error(ex.getMessage(),ex);
        return "error";
    }




}
