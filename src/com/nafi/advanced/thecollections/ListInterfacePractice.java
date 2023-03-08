package com.nafi.advanced.thecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfacePractice {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add(null);
        stringList.add(null);
        System.out.println(stringList.toString());
        System.out.println(stringList.add(null));
        stringList.add(2,"nafi");
        System.out.println(Collections.frequency(stringList,null));
        System.out.println(stringList.toString());
    }
}
