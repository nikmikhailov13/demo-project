package com.demo.demoproject.repository;

import com.demo.demoproject.entity.user.Car;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {

  List<Car> findAllByMade(String made);

  List<Car> findAllByPriceBetween(int min,int max);

}
