package com.nafi.advanced.exceptions;

import com.nafi.advanced.exceptions.ExceptionDemo;
import com.nafi.advanced.exceptions.InvalidException;

public class Main {
    public static void main(String[] args) throws InvalidException {
//        ExceptionDemo demo = new ExceptionDemo();
//        demo.show();
        ExceptionDemo.showFile();  // It will go to next line, as we handled this case already with exception
        ExceptionDemo.show(); // Program finished with exit function.
    }
}
