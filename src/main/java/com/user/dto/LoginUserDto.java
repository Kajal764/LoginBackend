package com.user.dto;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

public class LoginUserDto {

    @Column(nullable = false)
    @Pattern(regexp = "^([a-zA-Z0-9]{1,}[.]?[a-zA-Z0-9]{1,}?[@][a-zA-Z]{1,}([.][a-zA-Z]{2,4}){1,2})$", message = "Email must be valid")
    public String email;

    @Column(nullable = false)
    @Pattern(regexp = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%]).{6,})$", message = "Password Should contain One Uppercase and Symbol and greater than 6 character")
    public String password;
}
