package com.app.backend.model;

import java.util.Date;

public class StudentModel {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getPatLastName() {
        return patLastName;
    }

    public void setPatLastName(String patLastName) {
        this.patLastName = patLastName;
    }

    private String patLastName;

    public String getMatLastName() {
        return matLastName;
    }

    public void setMatLastName(String matLastName) {
        this.matLastName = matLastName;
    }

    private String matLastName;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private Date dateOfBirth;

}
