package com.backend.backend.service;

import java.util.List;

import com.backend.backend.dto.UserDto;

public interface IUserService {

    // UserDto getUser(String id);

    List<UserDto> getUsers();

}
