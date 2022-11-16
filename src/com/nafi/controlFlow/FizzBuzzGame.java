package com.nafi.controlFlow;

import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {

        System.out.println("Welcome to the fizz buzz game , Nice to see you here !!");
        boolean isGameOver = false;
        while(isGameOver == false) {
            System.out.println("Try a random number until you get fizz buzz");
            Scanner inputScanner = new Scanner(System.in);
            int numberEntered = inputScanner.nextInt();

            //Always use most specific condition on the top, because they never get executed in the last else if case
            if (numberEntered % 5 == 0 && numberEntered % 3 == 0){
                System.out.println("Fizz buzz");
                isGameOver = true;
                System.out.println("You won");
            }
            else if (numberEntered % 3 == 0) {
                System.out.println("Buzz");
            }
            else if (numberEntered % 5 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println("Try and try until u get succeed");
            }
        }
    }
}
