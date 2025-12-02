package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

public class WelfareOfficer implements Aid {

    private String officerName;

    public WelfareOfficer(String officerName) {
        this.officerName = officerName;
    }

    @Override
    public void submitAidRequest(AidRequest request) {
        System.out.println("Welfare Officer " + officerName + " received an aid request:");
        System.out.println("Worker Name: " + request.getName());
        System.out.println("Worker ID: " + request.getID());
        System.out.println("Worker Reason: " + request.getReason());
        System.out.println("Type of Aid: " + request.getTypeOfAid());
        System.out.println("Amount: " + request.getRequestedAmount());
    }
}
