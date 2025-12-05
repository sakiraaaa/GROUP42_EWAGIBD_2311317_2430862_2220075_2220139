package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.time.LocalDate;

public class Employee {
    private String Name;
    private String ID;
    private String Designation;
    private String Department;
    private String NewDesignation;
    private LocalDate EffectiveDate;

    public Employee(String name, String ID, String designation, String department, String newDesignation, LocalDate effectiveDate) {
        Name = name;
        this.ID = ID;
        Designation = designation;
        Department = department;
        NewDesignation = newDesignation;
        EffectiveDate = effectiveDate;
    }

    public Employee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getNewDesignation() {
        return NewDesignation;
    }

    public void setNewDesignation(String newDesignation) {
        NewDesignation = newDesignation;
    }

    public LocalDate getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        EffectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", Designation='" + Designation + '\'' +
                ", Department='" + Department + '\'' +
                ", NewDesignation='" + NewDesignation + '\'' +
                ", EffectiveDate=" + EffectiveDate +
                '}';
    }
}
