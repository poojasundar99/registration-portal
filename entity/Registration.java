package com.example.registrationportal.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "registration_details")
public class Registration {

    @Id
    @Column(name = "name",nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob",nullable = false)
    Date DOB;

    private String occupation;

    private int experience;

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Registration(String name, Date DOB, String occupation, int experience) {
        this.name = name;
        this.DOB = DOB;
        this.occupation = occupation;
        this.experience = experience;
    }

}
