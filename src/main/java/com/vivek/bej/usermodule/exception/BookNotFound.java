package com.vivek.bej.usermodule.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Book not Found")
public class BookNotFound extends Exception {
    public BookNotFound(String message) {
        super(message);
    }
}
