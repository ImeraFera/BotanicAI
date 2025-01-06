package com.backend.backend.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.backend.backend.exception.BaseException;

public class GlobalExceptionHandler {

    @ExceptionHandler(value = { BaseException.class })
    void handleGlobalException(BaseException ex) {

    }
}
