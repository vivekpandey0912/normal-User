package com.vivek.bej.usermodule.service;

import com.vivek.bej.usermodule.domain.User;
import com.vivek.bej.usermodule.exception.UserAlreadyExist;
import com.vivek.bej.usermodule.proxy.Proxy;
import com.vivek.bej.usermodule.reository.UserRepository;

public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final Proxy proxy;

    public UserServiceImpl(UserRepository userRepository, Proxy proxy) {
        this.userRepository = userRepository;
        this.proxy = proxy;
    }


    @Override
    public User registerAdmin(User user) throws UserAlreadyExist {
        if (userRepository.findById(user.getEmailId()).isPresent()) {
            throw new UserAlreadyExist("User Already Exists in the database");
        } else {
            user.setUserType("normal");
            User instanceUser = userRepository.save(user);
            if (!instanceUser.getName().isEmpty()) proxy.registerUser(instanceUser);
            return instanceUser;

        }
    }
}
