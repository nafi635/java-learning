package com.nafi.oop;

//Inherits an inbuilt Object class
public class UIControlObject extends Object {

    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

}
