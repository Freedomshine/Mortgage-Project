package org.oop.mortgage.controller;

import com.example.mortgage.model.MortgageResult;

import org.oop.mortgage.model.MortgageInput;
import org.oop.mortgage.service.ExcelCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mortgage")
public class MortgageController {

    @Autowired
    private ExcelCalculationService calculationService;

    @PostMapping("/calculate")
    public MortgageResult calculate(@RequestBody MortgageInput input) {
        return calculationService.calculateMortgage(input);
    }
}
