package com.projects.aquarium.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class SignInResponseDto {
    private String status;
    private String token;
}
