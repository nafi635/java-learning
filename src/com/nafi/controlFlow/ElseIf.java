package com.nafi.controlFlow;

public class ElseIf {
    public static void main(String[] args) {
        int temp = 12;
        if(temp> 30) {
            System.out.println("Its a hot day");
            boolean value = true;   // This variabe is not avialble outside of the block
        }
        else if (temp>20) {
            System.out.println("Medium hot day");
        }
        else if (temp>15) {
            System.out.println("Low hot day");
        }
        else {
            System.out.println("Its cool");
        }

        int income = 10000;
        boolean isHighCome = income > 100000 ? true : false;    // Ternary operator, use this in professional programming
    }
}
