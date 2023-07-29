package com.vivek.bej.usermodule.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not Found")
public class UserNotFound extends Exception{

    public UserNotFound(String message) {
        super(message);
    }
}
