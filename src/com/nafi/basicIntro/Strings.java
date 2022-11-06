package com.nafi.basicIntro;

public class Strings {
    public static void main(java.lang.String[] args) {

        //String is a reference type, create an object
        String helloWorld = "Hello World";
        String helloWorld1 = "Hello World";

        //You will a lot of inbuilt method to play with string
        System.out.println(helloWorld.indexOf('e'));  // In programming, index always starts with 0
        System.out.println(helloWorld.concat(helloWorld1));


        System.out.println(helloWorld.replace('H','B'));  // replace, replaceAll, replaceFirst
        System.out.println(helloWorld);  // String Replace method doesn't modify original string

        String s1="nafiwithifan";
        String s2="nafiwithifan";
        System.out.println(s1.equals(s2));//true because two strings are same
        System.out.println(s1.equalsIgnoreCase(s2));//true because two strings are same
        System.out.println(s1.compareTo(s2));//gives 0 because two strings are same. compareTo outputs are +ve, -ve numbers or 0
        System.out.println(s1.contains(s2));//true
        System.out.println(s1.endsWith("nafi"));//false

        System.out.println(s1.charAt(2)); // Prints f because f is there at index 2 (3rd position)
        System.out.println(String.format("The number prints like %d", 101));

        System.out.println(s1.indexOf("nafi"));//0

        String trimString="nafiwit    hifan";
        System.out.println(trimString.trim());  //Eliminates leading and trailing spaces
        System.out.println(trimString.toUpperCase());  // Lowercase and uppercase functionality

        int value=30;
        System.out.println(String.valueOf(value)); // Converts into different data types into string

    }
}
