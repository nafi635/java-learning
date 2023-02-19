package com.nafi.advanced.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        sayHello(null);
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }

    public  static void showFile() throws InvalidException {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            reader.close();
        } catch (FileNotFoundException x) {
            System.out.println("File Does not Exist");
        }
        catch (IOException e) {
            System.out.println("Could not read");
        }
        finally {
            throw new InvalidException();
        }
    }

    public void deposit(float value) {
        if(value <= 0)
            throw new IllegalArgumentException();
    }

    public void withdraw(float value) throws AccountException {
        if(value > 10000) {
            throw new AccountException();
        }
    }
}
