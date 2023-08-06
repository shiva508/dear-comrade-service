package com.pool.config.exception;

import com.pool.model.CommonResponse;
import com.pool.model.exception.RecordNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class DcGlobalExceptionConfig {

    @ExceptionHandler(RecordNotFoundException.class)
    public CommonResponse recordNotFoundhandler(RecordNotFoundException exception){
        return CommonResponse.builder().message(exception.getMessage()).statusCode(202).timeStamp(new Date()) .build();
    }
}
