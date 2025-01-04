package com.backend.backend.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.dto.UserDto;
import com.backend.backend.models.User;
import com.backend.backend.repository.UserRepository;
import com.backend.backend.service.IUserService;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {

        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {

            UserDto userDto = new UserDto();

            BeanUtils.copyProperties(user, userDtos);
            userDto.setGender(user.getGender().toString());
            userDtos.add(userDto);

        }
        return userDtos;

    }

}
