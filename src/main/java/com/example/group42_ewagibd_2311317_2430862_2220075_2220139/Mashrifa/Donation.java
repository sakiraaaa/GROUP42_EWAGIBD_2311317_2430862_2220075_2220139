package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;

import java.time.LocalDate;

public class Donation {
    private String donationId;
    private String employeeId;
    private double amount;
    private String paymentMethod;
    private LocalDate date;


    public Donation(String donationId, String employeeId, double amount, String paymentMethod, LocalDate date) {
        this.donationId = donationId;
        this.employeeId = employeeId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.date = date;
    }

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "donationId='" + donationId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", date=" + date +
                '}';
    }
}
