package com.user.service;

import com.user.dto.LoginUserDto;
import com.user.dto.RegisterUserDto;

public interface UserService {
    boolean register(RegisterUserDto registerUserDto);

    boolean login(LoginUserDto loginUserDto);
}
