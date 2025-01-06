package com.backend.backend.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = Include.NON_NULL)
public class BaseResponse<T> {

    private int status;

    private T payload;

    private String errorMessage;

    public static <T> BaseResponse<T> successResponse(T payload) {

        BaseResponse<T> baseResponse = new BaseResponse<>();

        baseResponse.setStatus(200);
        baseResponse.setErrorMessage(null);
        baseResponse.setPayload(payload);

        return baseResponse;

    }

    public static <T> BaseResponse<T> errorResponse(String errorMessage) {

        BaseResponse<T> baseResponse = new BaseResponse<>();

        baseResponse.setStatus(500);
        baseResponse.setErrorMessage(errorMessage);
        baseResponse.setPayload(null);

        return baseResponse;

    }

}
