package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

public class Collaboration {
    private String Title;
    private String PartnerName;
    private String Description;
    private String Visibility;

    public Collaboration(String title, String partnerName, String description, String visibility) {
        Title = title;
        PartnerName = partnerName;
        Description = description;
        Visibility = visibility;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPartnerName() {
        return PartnerName;
    }

    public void setPartnerName(String partnerName) {
        PartnerName = partnerName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getVisibility() {
        return Visibility;
    }

    public void setVisibility(String visibility) {
        Visibility = visibility;
    }

    @Override
    public String toString() {
        return "Collaboration{" +
                "Title='" + Title + '\'' +
                ", PartnerName='" + PartnerName + '\'' +
                ", Description='" + Description + '\'' +
                ", Visibility='" + Visibility + '\'' +
                '}';
    }
}
