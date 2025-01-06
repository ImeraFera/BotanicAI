package com.backend.backend.service.Impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.dto.UserDto;
import com.backend.backend.dto.UserDtoIU;
import com.backend.backend.models.User;
import com.backend.backend.repository.UserRepository;
import com.backend.backend.service.IUserService;

@Service
public class UserService implements IUserService {
    private User convertToEntity(UserDtoIU userDtoIU) {
        User user = new User();
        BeanUtils.copyProperties(userDtoIU, user);

        if (user.getGender() == null) {
            user.setGender(User.Gender.OTHER);
        }
        if (user.getCreatedAt() == null) {
            user.setCreatedAt(LocalDateTime.now());
        }
        return user;
    }

    private UserDto convertToDto(User user) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {

        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {

            UserDto userDto = new UserDto();

            BeanUtils.copyProperties(user, userDtos);
            userDto.setGender(user.getGender());
            userDtos.add(userDto);

        }
        return userDtos;

    }

    @Override
    public UserDto createUser(UserDtoIU userDtoIU) {
        if (userDtoIU == null) {
            throw new IllegalArgumentException("UserDtoIU cannot be null");
        }

        User newUser = convertToEntity(userDtoIU);

        User savedUser = userRepository.save(newUser);

        return convertToDto(savedUser);
    }

    @Override
    public UserDto findById(UUID id) {

        Optional<User> userOptional = userRepository.findById(id);

        return userOptional.isPresent() ? convertToDto(userOptional.get()) : null;

    }

    @Override
    public Void deleteUserById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUserById'");
    }

}
