package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

public class Organization {
    private String OrganizationName;
    private String Overview;
    private String TypeOfPartnerShip;

    public Organization(String organizationName, String overview, String typeOfPartnerShip) {
        OrganizationName = organizationName;
        Overview = overview;
        TypeOfPartnerShip = typeOfPartnerShip;
    }

    public Organization() {
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public String getTypeOfPartnerShip() {
        return TypeOfPartnerShip;
    }

    public void setTypeOfPartnerShip(String typeOfPartnerShip) {
        TypeOfPartnerShip = typeOfPartnerShip;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "OrganizationName='" + OrganizationName + '\'' +
                ", Overview='" + Overview + '\'' +
                ", TypeOfPartnerShip='" + TypeOfPartnerShip + '\'' +
                '}';
    }
}
