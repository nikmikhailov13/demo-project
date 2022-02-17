package com.demo.demoproject.service;

import com.demo.demoproject.entity.user.Passport;
import com.demo.demoproject.entity.user.User;
import com.demo.demoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User createUserWithPassport(String name, String passNumber) {
    User user = new User();
    user.setName(name);

    Passport passport = new Passport();
    passport.setSerialNumber(passNumber);

    user.setPassport(passport);

    return userRepository.save(user);
  }
}
