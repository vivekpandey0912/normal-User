package com.vivek.bej.usermodule.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Book already Exists")
public class BookAlreadyExist extends Exception{
    public BookAlreadyExist(String message) {
        super(message);
    }
}
