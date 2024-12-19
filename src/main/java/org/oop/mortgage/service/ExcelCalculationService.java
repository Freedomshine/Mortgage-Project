package org.oop.mortgage.service;

import com.example.mortgage.model.MortgageResult;
import org.oop.mortgage.model.MortgageInput;
import org.springframework.stereotype.Service;

@Service
public class ExcelCalculationService {

    public MortgageResult calculateMortgage(MortgageInput input) {
        // TODO: Implement the logic to interact with Excel. You may:
        // 1. Call an API to write input data into specific cells in Excel
        // 2. Trigger Excel calculations
        // 3. Read calculation results from Excel
        // The following is just a simulated result.

        MortgageResult result = new MortgageResult();

        // Assume a simple monthly payment calculation (for demonstration only, not a real formula)
        // In reality, the calculation results should come from Excel
        double loanAmount = input.getPropertyValue() - input.getDownPayment();
        double monthlyInterestRate = input.getInterestRate() / 12 / 100;
        int numberOfPayments = input.getLoanTermInYears() * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        result.setMonthlyPayment(monthlyPayment);
        result.setTotalInterestPaid((monthlyPayment * numberOfPayments) - loanAmount);

        // Simple qualification check
        double maxAffordable = input.getAnnualIncome() / 12 * 0.3;
        if (monthlyPayment <= maxAffordable) {
            result.setQualified(true);
            result.setRecommendationMessage("You qualify for the mortgage, with a monthly payment of " + String.format("%.2f", monthlyPayment));
        } else {
            result.setQualified(false);
            result.setRecommendationMessage("You do not qualify. Consider increasing the down payment or choosing a longer loan term.");
        }

        return result;
    }
}
