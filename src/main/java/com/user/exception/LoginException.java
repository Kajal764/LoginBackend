package com.user.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginException extends RuntimeException {

    public String message;
    public int statusCode;

}
