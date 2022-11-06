package com.nafi.basicIntro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        //Customer Introduction
        System.out.println("Hello, Welcome to EMI calculator !!! ");
        System.out.println("May I know your name please?");
        Scanner inputScanner = new Scanner(System.in);
        String customerName = inputScanner.nextLine();
        System.out.println("Thanks for choosing us " + customerName);

        //Taking different types of inputs
        System.out.println("Please enter the Principle Amount !!! ");
        Long principleAmount = inputScanner.nextLong();
        System.out.println("Annual Interest Rate Please !!! ");
        Double annualInterestRate = inputScanner.nextDouble();
        System.out.println("Period ( Years) !!! ");
        int period = inputScanner.nextInt();

        // Doing calculations
        System.out.println("Our system is doing calculation, please wait !!! ");
        double monthlyInterestRate =  annualInterestRate/100/12;
        int noOfTimesYouPay = period*12;
        double upperPart = monthlyInterestRate * Math.pow( 1 + monthlyInterestRate, noOfTimesYouPay);
        double lowerPart = Math.pow( 1 + monthlyInterestRate, noOfTimesYouPay) - 1;
        double calculateBy = upperPart / lowerPart;
        double monthlyPayment = principleAmount * calculateBy;

        // End Theory
        System.out.println("Loading ....");
        System.out.println("Monthly Payment you need to pay is " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
        System.out.println("Thanks, please visit again !! ");
        System.out.println("Have a nice day !! ");

        double totalAmountYouPay = monthlyPayment * noOfTimesYouPay;
        double interestYouPay = totalAmountYouPay - principleAmount;
        System.out.println("Total Amount pay is "+totalAmountYouPay);
        System.out.println("Total Interest you pay is"+ interestYouPay);
    }
}
