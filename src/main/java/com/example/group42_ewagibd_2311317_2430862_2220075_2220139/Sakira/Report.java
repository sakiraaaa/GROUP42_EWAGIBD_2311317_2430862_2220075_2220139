package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.time.LocalDate;

public class Report {
    private String ReporterName;
    private LocalDate Date;
    private String Time;
    private String Location;

    public Report(String reporterName, LocalDate date, String time, String location) {
        ReporterName = reporterName;
        Date = date;
        Time = time;
        Location = location;
    }

    public Report() {
    }

    public String getReporterName() {
        return ReporterName;
    }

    public void setReporterName(String reporterName) {
        ReporterName = reporterName;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Report{" +
                "ReporterName='" + ReporterName + '\'' +
                ", Date=" + Date +
                ", Time='" + Time + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
