package com.demo.demoproject.controller;

import com.demo.demoproject.entity.Car;
import com.demo.demoproject.entity.Passport;
import com.demo.demoproject.entity.User;
import com.demo.demoproject.repository.CarRepository;
import com.demo.demoproject.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private CarRepository carRepository;

  @GetMapping("/ping")
  public String ping() {
    User user = new User();
    user.setName("Nikita");

    Passport passport = new Passport();
    passport.setSerialNumber("WW1488VV");

    user.setPassport(passport);

    User savedUser = userRepository.save(user);
    Car car = new Car();
    car.setMade("VW");
    car.setPrice(40000);
    car.setUser(user);

    carRepository.save(car);

    return "pong";
  }

  @GetMapping("/cars")
  public List<String> getCars() {
    List<Car> car = carRepository.findAllByMade("VW");

    return car.stream()
        .map(Car::toString)
        .collect(Collectors.toList());
  }
}
