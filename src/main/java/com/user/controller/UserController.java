package com.user.controller;

import com.user.dto.LoginUserDto;
import com.user.dto.RegisterUserDto;
import com.user.dto.ResponseDto;
import com.user.exception.LoginException;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseDto register(@Valid @RequestBody RegisterUserDto registerUserDto) throws LoginException {
        boolean register = userService.register(registerUserDto);
        if (register)
            return new ResponseDto("Registration Successful", 200);
        throw new LoginException("User already register", 400);
    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    private ResponseDto login(@RequestBody LoginUserDto loginUserDto) throws LoginException {
        if (userService.login(loginUserDto))
            return new ResponseDto("Login Successful", 200);
        throw new LoginException("User Not Register", 400);
    }

}
