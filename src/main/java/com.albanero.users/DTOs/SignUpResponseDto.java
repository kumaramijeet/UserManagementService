package com.albanero.users.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private String email;
    private ResponseStatus responseStatus;
}
