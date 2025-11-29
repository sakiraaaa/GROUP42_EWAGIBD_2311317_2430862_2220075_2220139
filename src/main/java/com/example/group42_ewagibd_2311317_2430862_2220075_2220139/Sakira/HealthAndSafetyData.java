package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

import java.time.LocalDate;

public class HealthAndSafetyData {
    private String Title;
    private String Department;
    private LocalDate PublishedDate;
    private String Description;

    public HealthAndSafetyData(String title, String department, LocalDate publishedDate, String description) {
        Title = title;
        Department = department;
        PublishedDate = publishedDate;
        Description = description;
    }

    public HealthAndSafetyData() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public LocalDate getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        PublishedDate = publishedDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "HealthAndSafetyData{" +
                "Title='" + Title + '\'' +
                ", Department='" + Department + '\'' +
                ", PublishedDate=" + PublishedDate +
                ", Description='" + Description + '\'' +
                '}';
    }
}
