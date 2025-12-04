package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.time.LocalDate;

public class TermsAndCondition {
    private String NewTermStatement;
    private LocalDate Date;
    private String Department;
    private String SpecificCriteria;
    private String Reason;

    public TermsAndCondition(String newTermStatement, LocalDate date, String department, String specificCriteria, String reason) {
        NewTermStatement = newTermStatement;
        Date = date;
        Department = department;
        SpecificCriteria = specificCriteria;
        Reason = reason;
    }

    public TermsAndCondition() {
    }

    public String getNewTermStatement() {
        return NewTermStatement;
    }

    public void setNewTermStatement(String newTermStatement) {
        NewTermStatement = newTermStatement;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSpecificCriteria() {
        return SpecificCriteria;
    }

    public void setSpecificCriteria(String specificCriteria) {
        SpecificCriteria = specificCriteria;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    @Override
    public String toString() {
        return "TermsAndCondition{" +
                "NewTermStatement='" + NewTermStatement + '\'' +
                ", Date=" + Date +
                ", Department='" + Department + '\'' +
                ", SpecificCriteria='" + SpecificCriteria + '\'' +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
