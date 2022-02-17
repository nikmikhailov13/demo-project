package com.demo.demoproject;

import com.demo.demoproject.entity.appointment.Appointment;
import com.demo.demoproject.entity.appointment.AppointmentFactory;
import com.demo.demoproject.entity.sun.Sun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoProjectApplication.class, args);

    var sun = Sun.getINSTANCE();

    Appointment appointment = AppointmentFactory.createAppointment("zoom");
  }
}
