package com.example.registrationportal.repo;

import com.example.registrationportal.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RegistrationRepo extends JpaRepository<Registration, String> {

}
