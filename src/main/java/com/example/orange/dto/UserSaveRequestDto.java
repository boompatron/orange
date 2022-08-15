package com.example.orange.dto;

import com.example.orange.constant.Role;
import com.example.orange.entity.Location;
import com.example.orange.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private String email;
    private String name;
    private String password;
    private String phone_number;
    private Role role;
    private String username;
    private Location location;


    public User toEntity(){
        return User.builder()
                .email(email)
                .name(name)
                .password(password)
                .phone_number(phone_number)
                .role(role)
                .username(username)
                .location(location)
                .build();
    }
}
