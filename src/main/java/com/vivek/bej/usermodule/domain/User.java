package com.vivek.bej.usermodule.domain;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
public class User {

    @MongoId
    private String emailid;
    private String password;
    private String userType;

    private String name;

    private String address;

    private String phoneNumber;

    List<Book> bookList;



}
