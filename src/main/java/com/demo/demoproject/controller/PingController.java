package com.demo.demoproject.controller;

import com.demo.demoproject.entity.User;
import com.demo.demoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/ping")
  public String ping() {

    User user = new User();
    user.setEmail("email@email.com");
    userRepository.save(user);

    return "pong";
  }
}
