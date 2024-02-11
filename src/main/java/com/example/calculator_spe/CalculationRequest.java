package com.example.calculator_spe;

public class CalculationRequest {
    private double number;
    private double base;
    private double exponent;

    // Constructor
    public CalculationRequest(double number, double base, double exponent) {
        this.number = number;
        this.base = base;
        this.exponent = exponent;
    }

    // Getters and setters
    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getExponent() {
        return exponent;
    }

    public void setExponent(double exponent) {
        this.exponent = exponent;
    }
}
