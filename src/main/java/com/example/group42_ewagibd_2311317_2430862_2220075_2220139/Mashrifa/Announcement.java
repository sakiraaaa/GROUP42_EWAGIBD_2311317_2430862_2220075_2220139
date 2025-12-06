package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;

import java.time.LocalDate;

public class Announcement {
    private String announcementId;
    private String title;
    private String content;
    private String department;
    private LocalDate date;




    public String getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Announcement{" +
                "announcementId='" + announcementId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", department='" + department + '\'' +
                ", date=" + date +
                '}';
    }
}
