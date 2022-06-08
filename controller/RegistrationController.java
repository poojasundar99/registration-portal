package com.example.registrationportal.controller;

import com.example.registrationportal.entity.Registration;
import com.example.registrationportal.service.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RegistrationController {

    @Autowired
    private RegistrationServiceImpl registrationServiceImpl;

    @PostMapping(value ="/add" )
    public Registration createRegistration(@RequestBody Registration registration){
        return registrationServiceImpl.addRegistration(registration);
    }

    @DeleteMapping(value = "/deleteByName/{name}")
    public String deleteRegistrationByName(@PathVariable String name){
        return registrationServiceImpl.deleteRegistrationByName(name);
    }

    @PutMapping(value = "/update")
    public Registration updateRegistration(@RequestBody Registration registration){
        return registrationServiceImpl.updateRegistration(registration);
    }

    @GetMapping(value = "/check/{name}")
    public String checkRegistration(@PathVariable String name){
        return registrationServiceImpl.checkRegistrationName(name);
    }




}
