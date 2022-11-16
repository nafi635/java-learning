package com.nafi.controlFlow;

public class ForEachLoop {
    public static void main(String[] args) {

        // For collections we can use for loop
        String[] fruits = {"Apple","Mango", "Grapes"};
        for( String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
