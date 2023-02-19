package com.nafi.oop;

//Just an interface, it will calculate tax.
//Class A should call this interface, class B should be implemented calcualte tax
public interface TaxCalculaor {
    public double calculateTax();
}
