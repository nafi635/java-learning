package com.nafi.advanced.generics;

public class GenericList<T> {

    public T[] items = (T[]) new Object[10];
    public int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get (int index) {
        return items[index];
    }
}
