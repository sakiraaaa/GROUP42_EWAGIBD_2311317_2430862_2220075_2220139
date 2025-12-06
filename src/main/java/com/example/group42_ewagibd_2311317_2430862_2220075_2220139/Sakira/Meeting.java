package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.time.LocalDate;

public class
Meeting {
    private String MeetingTitle;
    private String Agenda;
    private String Department;
    private Integer Participants;
    private LocalDate Date;

    public Meeting(String meetingTitle, String agenda, String department, Integer participants, LocalDate date) {
        MeetingTitle = meetingTitle;
        Agenda = agenda;
        Department = department;
        Participants = participants;
        Date = date;
    }

    public Meeting() {
    }

    public String getMeetingTitle() {
        return MeetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        MeetingTitle = meetingTitle;
    }

    public String getAgenda() {
        return Agenda;
    }

    public void setAgenda(String agenda) {
        Agenda = agenda;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Integer getParticipants() {
        return Participants;
    }

    public void setParticipants(Integer participants) {
        Participants = participants;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "MeetingTitle='" + MeetingTitle + '\'' +
                ", Agenda='" + Agenda + '\'' +
                ", Department='" + Department + '\'' +
                ", Participants=" + Participants +
                ", Date=" + Date +
                '}';
    }
}
