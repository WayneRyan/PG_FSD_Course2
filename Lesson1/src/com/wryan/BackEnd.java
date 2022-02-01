package com.wryan;

public class BackEnd {
    private double operand;
    private String operation;

    public BackEnd(){
        operation = "";
    }

    public void storeOperation(String operation){
        this.operation = operation;
    }

    public double storeOperand(double operand){
        switch (operation) {
            case "+" : return this.operand = this.operand + operand;
            case "-" : return this.operand = this.operand - operand;
            case "*" : return this.operand = this.operand * operand;
            case "/" : return this.operand = this.operand / operand;
            default: return this.operand = operand;
        }
    }

    public String toString() {
        return "You have " + operand + " stored in your calculator";
    }

}
