package com.nafi.basicIntro;

public class TypeCastingConcept {
    public static void main(String[] args) {
        //type casting
        int num= (int)(67.65f);
        System.out.println(num);

        byte a=40;
        byte b=50;
        int c= a*b; // Automatic promotion in java (2000 can't be stored in byte)
        System.out.println(c);
    }
}
