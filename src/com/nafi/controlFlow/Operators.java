package com.nafi.controlFlow;

public class Operators {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        Integer g = 1;
        System.out.println(x==y);
        System.out.println(x==g);  /// It compares object value too

        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature <30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCreditScore = true;
        boolean isEligibleForLoan = hasHighIncome || hasGoodCreditScore;
        System.out.println(isEligibleForLoan);

    }
}
