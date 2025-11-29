package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

public class Announcement {
    private String Title;
    private String Description;
    private String SelectiveVisibility;
    private String Content;
    private String Department;
    private String AnnouncementDate;

    public Announcement(String title, String description, String selectiveVisibility, String content, String department, String announcementDate) {
        Title = title;
        Description = description;
        SelectiveVisibility = selectiveVisibility;
        Content = content;
        Department = department;
        AnnouncementDate = announcementDate;
    }

    public Announcement() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSelectiveVisibility() {
        return SelectiveVisibility;
    }

    public void setSelectiveVisibility(String selectiveVisibility) {
        SelectiveVisibility = selectiveVisibility;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAnnouncementDate() {
        return AnnouncementDate;
    }

    public void setAnnouncementDate(String announcementDate) {
        AnnouncementDate = announcementDate;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", SelectiveVisibility='" + SelectiveVisibility + '\'' +
                ", Content='" + Content + '\'' +
                ", Department='" + Department + '\'' +
                ", AnnouncementDate='" + AnnouncementDate + '\'' +
                '}';
    }
}
