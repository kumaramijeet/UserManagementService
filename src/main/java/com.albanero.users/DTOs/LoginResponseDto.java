package com.albanero.users.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
    private Integer userId;
    private ResponseStatus responseStatus;
}
