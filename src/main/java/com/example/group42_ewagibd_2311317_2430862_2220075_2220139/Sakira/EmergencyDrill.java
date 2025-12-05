package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.io.Serializable;
import java.time.LocalDate;

public class EmergencyDrill implements Serializable {
    private Integer TeamMembers;
    private String Type;
    private String Location;
    private LocalDate Date;

    public EmergencyDrill(Integer teamMembers, String type, String location, LocalDate date) {
        TeamMembers = teamMembers;
        Type = type;
        Location = location;
        Date = date;
    }

    public EmergencyDrill() {
    }

    public Integer getTeamMembers() {
        return TeamMembers;
    }

    public void setTeamMembers(Integer teamMembers) {
        TeamMembers = teamMembers;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "EmergencyDrill{" +
                "TeamMembers=" + TeamMembers +
                ", Type='" + Type + '\'' +
                ", Location='" + Location + '\'' +
                ", Date=" + Date +
                '}';
    }
}
