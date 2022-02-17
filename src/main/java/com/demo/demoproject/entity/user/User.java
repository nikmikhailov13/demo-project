package com.demo.demoproject.entity.user;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name = "user", schema = "demo")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "passport_id")
  private Passport passport;

  @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
  private List<Car> cars;

  public User() {
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Passport getPassport() {
    return passport;
  }

  public void setPassport(Passport passport) {
    this.passport = passport;
  }
}
