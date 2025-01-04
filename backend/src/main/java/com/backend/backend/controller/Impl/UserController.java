package com.backend.backend.controller.Impl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.controller.BaseController;
import com.backend.backend.controller.BaseResponse;
import com.backend.backend.dto.UserDto;
import com.backend.backend.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController extends BaseController {

    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public BaseResponse<List<UserDto>> getUsers() {

        return success(userService.getUsers());

    }
}
