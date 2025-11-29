package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

public class Worker {
    private String Title;
    private String Content;
    private String Visibility;
    private String Name;
    private String ID;
    private String TypeOfServices;
    private String TypeOfAid;

    public Worker(String title, String content, String name, String visibility, String ID, String typeOfServices, String typeOfAid) {
        Title = title;
        Content = content;
        Name = name;
        Visibility = visibility;
        this.ID = ID;
        TypeOfServices = typeOfServices;
        TypeOfAid = typeOfAid;
    }

    public Worker() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getVisibility() {
        return Visibility;
    }

    public void setVisibility(String visibility) {
        Visibility = visibility;
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

    public String getTypeOfServices() {
        return TypeOfServices;
    }

    public void setTypeOfServices(String typeOfServices) {
        TypeOfServices = typeOfServices;
    }

    public String getTypeOfAid() {
        return TypeOfAid;
    }

    public void setTypeOfAid(String typeOfAid) {
        TypeOfAid = typeOfAid;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Title='" + Title + '\'' +
                ", Content='" + Content + '\'' +
                ", Visibility='" + Visibility + '\'' +
                ", Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", TypeOfServices='" + TypeOfServices + '\'' +
                ", TypeOfAid='" + TypeOfAid + '\'' +
                '}';
    }
}
