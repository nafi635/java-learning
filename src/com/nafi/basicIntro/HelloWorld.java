package com.nafi.basicIntro;
//Package is nothing but folder which contains set of classes

public class HelloWorld {    // Why this is public ?... You should be accessing this anywhere, because program starts here
    // class name should be main , java executes first method is main
    //Strings[] args - taken from command prompt
    // Void method - it tell the method, it is not returning anything - Void is function method reserve keyword
    // Same Public - it should be acessed from anywhere because it is a main method in main class
    // Static - When compiler starts compiler, static method loads first time
    public static void main(String[] args) {
        System.out.println("Hello world!");  // System. out - PrintStream, also we have System. in -- Input Stream, used in the scanner calss
    }
}