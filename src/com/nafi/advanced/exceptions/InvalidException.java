package com.nafi.advanced.exceptions;

//This is the custom exception which we write which should be extended to exception
public class InvalidException extends Exception{

    public InvalidException() {
        System.out.println("Invalid Exception");
    }
}
