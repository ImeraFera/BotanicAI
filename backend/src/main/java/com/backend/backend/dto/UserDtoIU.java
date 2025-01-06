package com.backend.backend.dto;

import com.backend.backend.models.User.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDtoIU {

    private String name;
    private String biography;
    private String username;
    private String email;
    private String password;
    private String profilePicture;
    private Gender gender;
    private boolean isBanned;
    private boolean isLocked;

}
