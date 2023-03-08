package com.nafi.advanced.generics;

public class Main {
    public static void main(String[] args) {
        //  new GenericList<Integer>().add("asd"); //It gives compile time error when u add a different type of data]

        GenericList<Integer> ints = new GenericList<>();
        int randomNumber = 2;
        ints.add(randomNumber);
        ints.add(3);
        ListImplementation list = new ListImplementation();
        list.add(null);

        var user1 = new User(10);
        var user2 = new User(20);

        if(user1.compareTo(user2) == 0) {
            System.out.println("User 1 === user 2");
        }
    }
}

