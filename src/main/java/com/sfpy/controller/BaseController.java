package com.sfpy.controller;

import com.sfpy.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/11/16.
 */
@Controller
public class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler
    public String exp(HttpServletRequest request, Exception ex) {

        log.error( "【抛出异常】--异常路径为：" + request.getServletPath()
                + "\n【异常信息】--" +  ex.getMessage() ) ;

        request.setAttribute("ex", ex);

        // 根据不同错误转向不同页面
        if(ex instanceof BusinessException) {
            return "error-business";
        }else {
            return "error";
        }
    }

   /*  另外一种方法
   public ModelAndView resolveException( HttpServletRequest request, HttpServletResponse response,
                                          Object handler, Exception exception ) {

        System.out.println( "【抛出异常】--异常路径为：" + request.getServletPath() + "\n【异常信息】--" +  exception.getMessage() ) ;
        //如果不是抛出的action业务异常则不处理


        if( !( exception instanceof SystemException ) ) {
            return null;
        }

        final SystemException actionE = (SystemException) exception;

        ModelAndView model = null;
        if( actionE.getForwardType() == SystemException.FORWARD ) {
            //进入页面渲染


            model = new ModelAndView( actionE.getModelPath(), actionE.getAttributes() );
        } else if( actionE.getForwardType() == SystemException.REDIRECT ) {
            model = new ModelAndView( new RedirectView( actionE.getModelPath(), true ) );
        } else {
            //直接返回页面内容


            model = new ModelAndView( new View() {
                @Override
                public void render(Map<String, ?> arg0, HttpServletRequest arg1,
                                   HttpServletResponse arg2) throws Exception {

                    arg2.setContentType( "text/html" );
                    arg2.setCharacterEncoding( actionE.getEncode() );
                    if( actionE.getResponseBody() != null ) {
                        arg2.getWriter().print( actionE.getResponseBody() );
                    }
                }

                @Override
                public String getContentType() {
                    return "text/html; charset=utf-8";
                }
            } );
        }

        return model;
    }*/

}
