package com.nafi.oop;

public class TextBox {
    public String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void clear() {
        this.text = "";
    }
}
