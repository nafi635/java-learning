package com.nafi.oop;

public class TaxDone implements TaxCalculaor {

    private double taxableIncome;

    public TaxDone(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return  taxableIncome * 0.4;
    }
}
