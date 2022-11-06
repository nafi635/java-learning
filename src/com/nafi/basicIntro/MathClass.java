package com.nafi.basicIntro;

import java.text.NumberFormat;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.round(1.1));   // Most of the math functions returns doubles value, need to be bit caution here
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.max(2,4));
        System.out.println(Math.max(2,4.2222));
        System.out.println(Math.min(2,4.2222));
        System.out.println(Math.random());  // Generates random number between one zero

        //Implicit casting is required most of the time for these math functions as they returns value of
        NumberFormat currency = NumberFormat.getCurrencyInstance();  // Number Formatting a numbers
        String result = currency.format(12344.44);
        System.out.println(result);

        NumberFormat percentInstance = NumberFormat.getPercentInstance();  // Number Formatting a numbers
        String percent = percentInstance.format(0123.55);
        System.out.println(percent);

        //Method Chaining - You can directly call that method, can eliminate currency variable on above example
        String  numberFormat = NumberFormat.getCurrencyInstance().format(11);
        System.out.println(numberFormat);

    }
}
