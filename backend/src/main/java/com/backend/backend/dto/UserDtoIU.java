package com.backend.backend.dto;

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
    private String gender;
    private Boolean isBanned;
    private Boolean isLocked;

}
