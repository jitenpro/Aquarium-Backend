package com.projects.aquarium.dto.user;

import com.projects.aquarium.entity.Role;
import lombok.Data;

@Data
public class UserUpdateDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private Role role;

}
