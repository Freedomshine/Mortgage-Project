package org.oop.mortgage.model;

public class MortgageInput {
    private double propertyValue;
    private double downPayment;
    private double interestRate;
    private int loanTermInYears;
    private double annualIncome;
    private double otherDebts;

    // Getters and Setters
    public double getPropertyValue() { return propertyValue; }
    public void setPropertyValue(double propertyValue) { this.propertyValue = propertyValue; }

    public double getDownPayment() { return downPayment; }
    public void setDownPayment(double downPayment) { this.downPayment = downPayment; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public int getLoanTermInYears() { return loanTermInYears; }
    public void setLoanTermInYears(int loanTermInYears) { this.loanTermInYears = loanTermInYears; }

    public double getAnnualIncome() { return annualIncome; }
    public void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }

    public double getOtherDebts() { return otherDebts; }
    public void setOtherDebts(double otherDebts) { this.otherDebts = otherDebts; }
}
