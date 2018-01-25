package com.sys.deduct.exception;


import org.apache.log4j.Logger;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public String processException(Exception ex, HttpServletRequest request, HttpServletResponse response){
        ex.printStackTrace();

        if(ex instanceof MissingServletRequestParameterException){
            return null;
        }
        if(ex instanceof CustomizeException){
            logger.error("================= " + ex.getMessage() + " =================");
            return null;
        }
        return null;
    }
}
