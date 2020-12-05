package com.user.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor
@ToString
public class ResponseDto {

    public String message;
    public int statusCode;

    public ResponseDto(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

}
