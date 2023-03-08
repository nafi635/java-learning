package com.nafi.advanced.thecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingData {

    public static void main(String[] args) {
        //We can use sorting directly with the objects which are already there
//        List<String> listOfString = new ArrayList<>();
//        Collections.addAll(listOfString,"D","A","C");
//        Collections.sort(listOfString);
//        System.out.println(listOfString);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("nafi","e3"));
        customers.add(new Customer("ifan","e4"));
        customers.add(new Customer("zYes","e5"));
//        Collections.sort(customers,Customer::compareTo);
        Collections.sort(customers);
        System.out.println(customers);

    }

//    public class Compare implements Comparator<String> {
//
//    }
}
