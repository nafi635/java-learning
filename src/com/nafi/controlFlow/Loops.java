package com.nafi.controlFlow;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Basic for loop - Suppose you want to print hello world multiple times
        // Incrementing loops
        for(int i=0;i<5;i++){
            System.out.println("hello world" + i);
        }

        // decrementing loops
        for(int i=5;i>0;i--){
            System.out.println("hello world" + i);
        }

        // Use while loops when u know how many times you execute the program
        int i=5;
        while(i>0) {
            System.out.println("Hello world "+i);
            i--;
        }


        Scanner inputScanner = new Scanner(System.in);
        String input="";
        while (!input.equals("quit")){
            System.out.println("Input a string");
            input = inputScanner.nextLine().toLowerCase();
        }

        // Do while loop is very similar to while loop but it atleast execute one time
        do {
            System.out.println("Input a string");
            input = inputScanner.nextLine().toLowerCase();
        } while (!input.equals("quit"));


        // While true loop & Break and continue
        String input1 = "";
        while (true){
            System.out.println("Input a string");
            input1 = inputScanner.nextLine().toLowerCase();
            if(input1.equals("pass"))
                continue;
            if(input1.equals("quit"))
                break;
        }
    }
}
