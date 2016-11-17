package com.sfpy.exception;

import org.omg.CORBA.Object;
import org.springframework.dao.DataAccessException;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/11/17.
 */
public class WebExceptionCommon {

    //数据库操作失败
    public static final Class<DataAccessException> DATA_ACCESS_EXCEPTION_CLASS = DataAccessException.class;
    //调用了未经初始化的对象或者是不存在的对象
    public static final Class<NullPointerException> NULL_POINTER_EXCEPTION_CLASS = NullPointerException.class;
    //IO异常
    public static final Class<IOException> IO_EXCEPTION_CLASS = IOException.class;
    //指定的类不存在
    public static final Class<ClassNotFoundException> CLASS_NOT_FOUND_EXCEPTION_CLASS = ClassNotFoundException.class;
    //数学运算异常
    public static final Class<ArithmeticException> ARITHMETIC_EXCEPTION_CLASS = ArithmeticException.class;
    //数组下标越界
    public static final Class<ArrayIndexOutOfBoundsException> ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION_CLASS = ArrayIndexOutOfBoundsException.class;
    //方法的参数错误
    public static final Class<IllegalArgumentException> ILLEGAL_ARGUMENT_EXCEPTION_CLASS = IllegalArgumentException.class;
    //方法的参数错误
    public static final Class<ClassCastException> CLASS_CAST_EXCEPTION_CLASS = ClassCastException.class;
    //违背安全原则异常
    public static final Class<SecurityException> SECURITY_EXCEPTION_CLASS = SecurityException.class;
    //操作数据库异常
    public static final Class<SQLException> SQL_EXCEPTION_CLASS = SQLException.class;
    //方法末找到异常
    public static final Class<NoSuchMethodError> NO_SUCH_METHOD_ERROR_CLASS = NoSuchMethodError.class;
    //jvm内部错误
    public static final Class<InternalError> INTERNAL_ERROR_CLASS = InternalError.class;
    //其他异常
    public static final Class<Exception> EXCEPTION_CLASS = Exception.class;
}
