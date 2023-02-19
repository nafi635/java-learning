package com.nafi.oop;

public class UpcastingDowncasting {

    public static void main(String[] args) {
        var textBox = new TextBox();
        show(textBox);
    }

    public static void show(Object control) {
        System.out.println(control);
    }
}
