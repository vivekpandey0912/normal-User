package com.vivek.bej.usermodule.service;

import com.vivek.bej.usermodule.domain.User;
import com.vivek.bej.usermodule.exception.UserAlreadyExist;

public interface UserService {

    public User registerAdmin(User user) throws UserAlreadyExist;

}
