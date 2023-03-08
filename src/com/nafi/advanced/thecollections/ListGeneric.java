package com.nafi.advanced.thecollections;

import com.nafi.advanced.generics.GenericList;

import java.util.Iterator;

public class ListGeneric<T> implements Iterable<T> {

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get (int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {

        private ListGeneric<T> list;
        private int index;

        public ListIterator(ListGeneric<T> list) {



            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
