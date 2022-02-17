package com.demo.demoproject.controller;

import com.demo.demoproject.entity.user.Car;
import com.demo.demoproject.entity.user.User;
import com.demo.demoproject.service.CarService;
import com.demo.demoproject.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @Autowired
  private UserService userService;

  @Autowired
  private CarService carService;

  @GetMapping("/ping")
  public String ping() {

    User user = userService.createUserWithPassport("Ivan", "FG816524");
    carService.addCarToUser("VW", 40000, user);

    return "pong";
  }

  @GetMapping("/cars")
  public List<String> getCars() {
    List<Car> cars = carService.getCarsByMade("VW");

    return cars.stream()
        .map(Car::toString)
        .collect(Collectors.toList());
  }
}
