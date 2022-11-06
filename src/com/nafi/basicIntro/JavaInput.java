package com.nafi.basicIntro;
import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //It reads everything you want , in = Keyboard
        int inputInt = input.nextInt();
        System.out.println("Your Number" + inputInt);  // You need to take care of parsing exceptions here.


        System.out.println("Enter Your Nick Name :");
        String name = input.next();   // but it won't take strings that you type after space For example: Nafi Mohammad, it only takes Nafi, not mohammad.
        System.out.println("Your name" + name);

        System.out.print("Enter Your Full Name :");
        String fullName = input.next();   // Now it will take total line of the input -  Nafi Mohammad, it prints Nafi Mohammad
        System.out.println("Your name" + fullName);
    }
}
