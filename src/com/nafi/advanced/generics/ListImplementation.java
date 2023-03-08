package com.nafi.advanced.generics;

import java.util.Objects;

public class ListImplementation {
    private int[] items = new int[10];
    private int count;

    public void add(Integer item) {
/*
        Objects.requireNonNull(item, "This is null");
*/
        System.out.println(Objects.isNull(item));
       /* if(Objects.isNull(item))
        {
            System.out.println("This is null");
        };*/
    }

    public int get(int index) {
        return items[index];
    }


}
