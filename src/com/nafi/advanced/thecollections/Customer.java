package com.nafi.advanced.thecollections;

// Comparable and Comparator interfaces
public class Customer implements Comparable<Customer>{

    public String name;
    public String email;

    public Customer( String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
        // this < other => -1
        //this == other => 0
        //this > other ->1
    }

    @Override
    public String toString() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
