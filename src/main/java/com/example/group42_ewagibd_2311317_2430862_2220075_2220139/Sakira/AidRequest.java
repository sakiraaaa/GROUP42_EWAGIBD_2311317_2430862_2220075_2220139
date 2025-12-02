package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;

public class AidRequest {
    private String Name;
    private String ID;
    private String TypeOfAid;
    private String Reason;
    private float RequestedAmount;

    public AidRequest(String name, String ID, String typeOfAid, String reason, float requestedAmount) {
        Name = name;
        this.ID = ID;
        TypeOfAid = typeOfAid;
        Reason = reason;
        RequestedAmount = requestedAmount;
    }

    public AidRequest() {
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

    public String getTypeOfAid() {
        return TypeOfAid;
    }

    public void setTypeOfAid(String typeOfAid) {
        TypeOfAid = typeOfAid;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public float getRequestedAmount() {
        return RequestedAmount;
    }

    public void setRequestedAmount(float requestedAmount) {
        RequestedAmount = requestedAmount;
    }

    @Override
    public String toString() {
        return "AidRequest{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", TypeOfAid='" + TypeOfAid + '\'' +
                ", Reason='" + Reason + '\'' +
                ", RequestedAmount=" + RequestedAmount +
                '}';
    }
}
