package com.backend.backend.controller;

public class BaseController {

    public <T> BaseResponse<T> success(T payload) {

        return BaseResponse.successResponse(payload);

    }

    public <T> BaseResponse<T> error(String errorMessage) {

        return BaseResponse.errorResponse(errorMessage);

    }
}
