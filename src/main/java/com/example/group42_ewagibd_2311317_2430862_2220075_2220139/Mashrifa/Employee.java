package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;

import com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira.TrainingProgram;

import java.util.List;

public class Employee {
    private String employeeID;
    private String department;
    private String designation;
    private String address;

    private List<WelfareClaim> claims;
    private List<TrainingProgram> trainingEnrollments;
    private List<Donation> donations;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<WelfareClaim> getClaims() {
        return claims;
    }

    public void setClaims(List<WelfareClaim> claims) {
        this.claims = claims;
    }

    public List<TrainingProgram> getTrainingEnrollments() {
        return trainingEnrollments;
    }

    public void setTrainingEnrollments(List<TrainingProgram> trainingEnrollments) {
        this.trainingEnrollments = trainingEnrollments;
    }
}
