package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.time.LocalDate;

public class TrainingProgram {
    private String Topic;
    private String TrainerID;
    private LocalDate TrainingDate;
    private String TrainingTime;
    private String Location;
    private String ParticipatingDepartment;

    public TrainingProgram(String topic, String trainerID, LocalDate trainingDate, String trainingTime, String location, String participatingDepartment) {
        Topic = topic;
        TrainerID = trainerID;
        TrainingDate = trainingDate;
        TrainingTime = trainingTime;
        Location = location;
        ParticipatingDepartment = participatingDepartment;
    }

    public TrainingProgram() {
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public String getTrainerID() {
        return TrainerID;
    }

    public void setTrainerID(String trainerID) {
        TrainerID = trainerID;
    }

    public LocalDate getTrainingDate() {
        return TrainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        TrainingDate = trainingDate;
    }

    public String getTrainingTime() {
        return TrainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        TrainingTime = trainingTime;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getParticipatingDepartment() {
        return ParticipatingDepartment;
    }

    public void setParticipatingDepartment(String participatingDepartment) {
        ParticipatingDepartment = participatingDepartment;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "Topic='" + Topic + '\'' +
                ", TrainerID='" + TrainerID + '\'' +
                ", TrainingDate=" + TrainingDate +
                ", TrainingTime='" + TrainingTime + '\'' +
                ", Location='" + Location + '\'' +
                ", ParticipatingDepartment='" + ParticipatingDepartment + '\'' +
                '}';
    }
}
