package com.demo.demoproject.entity.appointment;

public class AppointmentFactory {

  public static Appointment createAppointment(String type) {
    Appointment appointment = null;
    if (type.equals("zoom")) {
      appointment = new ZoomAppointment();
    } else if (type.equals("real")) {
      appointment = new RealLifeAppointment();
    }
    return appointment;
  }
}
