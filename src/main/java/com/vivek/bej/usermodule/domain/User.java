package com.vivek.bej.usermodule.domain;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.util.Objects;

@Document
public class User {

    @MongoId
    private String emailId;
    private String password;
    private String userType;

    private String name;

    private String address;

    private String phoneNumber;

    List<Book> bookList;

    public User(String emailId, String password, String userType, String name, String address, String phoneNumber, List<Book> bookList) {
        this.emailId = emailId;
        this.password = password;
        this.userType = userType;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bookList = bookList;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(emailId, user.emailId) && Objects.equals(password, user.password) && Objects.equals(userType, user.userType) && Objects.equals(name, user.name) && Objects.equals(address, user.address) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(bookList, user.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, password, userType, name, address, phoneNumber, bookList);
    }

    @Override
    public String toString() {
        return "User{" +
                "emailid='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
