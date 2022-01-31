package com.demo.demoproject.repository;

import com.demo.demoproject.entity.Passport;
import liquibase.pro.packaged.R;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {

}
