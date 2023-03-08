package com.nafi.advanced.lambdas;

public class LamdasDemo {
    public static void main(String[] args) {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}
