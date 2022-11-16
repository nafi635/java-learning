package com.nafi.controlFlow;

public class SwitchCase {
    public static void main(String[] args) {
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("You are guest");
        }

        // You can also convert this to if and else statement by writing if , else if and else
    }
}
