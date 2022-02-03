package com.demo.demoproject.service;

import com.demo.demoproject.entity.Car;
import com.demo.demoproject.entity.User;
import com.demo.demoproject.repository.CarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

  @Autowired
  private CarRepository carRepository;

  public void addCarToUser(String carMade, int carPrice, User user) {
    Car car = new Car();
    car.setMade(carMade);
    car.setPrice(carPrice);
    car.setUser(user);

    carRepository.save(car);
  }

  public List<Car> getCarsByMade(String carMade) {
    return carRepository.findAllByMade(carMade);
  }
}
