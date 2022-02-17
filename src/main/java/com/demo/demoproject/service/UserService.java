package com.demo.demoproject.service;

import com.demo.demoproject.entity.user.User;

public interface UserService {

  User createUserWithPassport(String name, String passNumber);

}
