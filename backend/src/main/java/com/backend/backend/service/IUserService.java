package com.backend.backend.service;

import java.util.List;
import java.util.UUID;

import com.backend.backend.dto.UserDto;
import com.backend.backend.dto.UserDtoIU;

public interface IUserService {

    List<UserDto> getUsers();

    UserDto createUser(UserDtoIU userDtoIU);

    UserDto findById(UUID id);

    Void deleteUserById(UUID id);

}
