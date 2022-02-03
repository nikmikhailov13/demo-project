package com.demo.demoproject.service;

import com.demo.demoproject.entity.Passport;
import com.demo.demoproject.entity.User;
import com.demo.demoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User createUserWithPassport(String name, String passNumber) {
    User user = new User();
    user.setName(name);

    Passport passport = new Passport();
    passport.setSerialNumber(passNumber);

    user.setPassport(passport);

    return userRepository.save(user);
  }
}
