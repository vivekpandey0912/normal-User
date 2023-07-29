package com.vivek.bej.usermodule.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "User Already Exists")
public class UserAlreadyExist extends Exception{

    public UserAlreadyExist(String message) {
        super(message);
    }
}
