package com.example.registrationportal.service;

import com.example.registrationportal.entity.Registration;
import com.example.registrationportal.repo.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepo registrationRepo;

    private Registration savedRegistration;

    public String checkRegistrationName(String name) {
        if (savedRegistration.equals(registrationRepo.findById(name))) {
            return "The Registration Data " +name+ " `is in Database`";
        }
        else return "The Registration Data " +name+ " is `NOT` in the Database";
    }
    public Registration addRegistration(Registration registration){
        return  registrationRepo.save(registration);
    }

    public String deleteRegistrationByName(String name){
        registrationRepo.deleteById(name);
        return "The Registration User `" +name+ "` Deleted successfully";
    }

    public Registration updateRegistration(Registration registration){
        return registrationRepo.saveAndFlush(registration);
    }

}
