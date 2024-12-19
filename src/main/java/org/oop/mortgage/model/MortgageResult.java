package com.example.mortgage.model;

public class MortgageResult {
    private boolean qualified;
    private double monthlyPayment;
    private double totalInterestPaid;
    private String recommendationMessage;

    // Getters and Setters
    public boolean isQualified() { return qualified; }
    public void setQualified(boolean qualified) { this.qualified = qualified; }

    public double getMonthlyPayment() { return monthlyPayment; }
    public void setMonthlyPayment(double monthlyPayment) { this.monthlyPayment = monthlyPayment; }

    public double getTotalInterestPaid() { return totalInterestPaid; }
    public void setTotalInterestPaid(double totalInterestPaid) { this.totalInterestPaid = totalInterestPaid; }

    public String getRecommendationMessage() { return recommendationMessage; }
    public void setRecommendationMessage(String recommendationMessage) { this.recommendationMessage = recommendationMessage; }
}
