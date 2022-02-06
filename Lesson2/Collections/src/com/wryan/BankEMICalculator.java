package com.wryan;

public class BankEMICalculator {

    private String customerName;
    private String accountNo;
    private double loanAmount;
    private EMICalculatorHelper helper = new EMICalculatorHelper();


    private class EMICalculatorHelper {
        int loanTerm = 60;
        double interestRate = 0.9;
        double interestPerMonth = interestRate / loanAmount;

        protected double calcMonthlyPayment ( double loanAmount){
            double EMI = ( loanAmount * interestPerMonth) / ((1.0) - ((1.0) / Math.pow(1.0 + interestPerMonth, loanTerm)));
            return Math.round(EMI);
        }
    }
}
