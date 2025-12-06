package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.io.Serializable;
import java.time.LocalDate;

public class Programs implements Serializable {
    private String ProgramTitle;
    private String ProgramDescription;
    private String TargetBeneficiaries;
    private String ProgramCatagory;
    private LocalDate Date;

    public Programs(String programTitle, String programDescription, String targetBeneficiaries, String programCatagory, LocalDate date) {
        ProgramTitle = programTitle;
        ProgramDescription = programDescription;
        TargetBeneficiaries = targetBeneficiaries;
        ProgramCatagory = programCatagory;
        Date = date;
    }

    public String getProgramTitle() {
        return ProgramTitle;
    }

    public void setProgramTitle(String programTitle) {
        ProgramTitle = programTitle;
    }

    public String getProgramDescription() {
        return ProgramDescription;
    }

    public void setProgramDescription(String programDescription) {
        ProgramDescription = programDescription;
    }

    public String getTargetBeneficiaries() {
        return TargetBeneficiaries;
    }

    public void setTargetBeneficiaries(String targetBeneficiaries) {
        TargetBeneficiaries = targetBeneficiaries;
    }

    public String getProgramCatagory() {
        return ProgramCatagory;
    }

    public void setProgramCatagory(String programCatagory) {
        ProgramCatagory = programCatagory;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Programs{" +
                "ProgramTitle='" + ProgramTitle + '\'' +
                ", ProgramDescription='" + ProgramDescription + '\'' +
                ", TargetBeneficiaries='" + TargetBeneficiaries + '\'' +
                ", ProgramCatagory='" + ProgramCatagory + '\'' +
                ", Date=" + Date +
                '}';
    }
}
