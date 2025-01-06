package com.backend.backend.controller.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.controller.BaseController;
import com.backend.backend.controller.BaseResponse;
import com.backend.backend.dto.UserDto;
import com.backend.backend.dto.UserDtoIU;
import com.backend.backend.service.IUserService;

import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController extends BaseController {

    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public BaseResponse<List<UserDto>> getUsers() {
        return success(userService.getUsers());

    }

    @PostMapping("/create")
    public BaseResponse<UserDto> createUser(@RequestBody UserDtoIU userDtoIU) {
        return success(userService.createUser(userDtoIU));
    }

    @GetMapping("/{id}")
    public BaseResponse<UserDto> findById(@PathVariable UUID id) {
        return success(userService.findById(id));
    }

    @DeleteMapping("/{id}")
    public BaseResponse<Void> deleteUserById(@PathVariable UUID id) {
        return success(userService.deleteUserById(id));
    }
}
