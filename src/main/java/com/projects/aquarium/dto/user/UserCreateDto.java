package com.projects.aquarium.dto.user;

import com.projects.aquarium.entity.Role;
import lombok.Data;

@Data
public class UserCreateDto {
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private String password;
}
