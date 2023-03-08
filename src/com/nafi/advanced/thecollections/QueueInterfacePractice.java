package com.nafi.advanced.thecollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfacePractice {

    public static void main(String[] args) {

        Queue<String> stringQueue = new ArrayDeque<>();
        stringQueue.add("one");
        stringQueue.add("two");
        stringQueue.add("three");
        stringQueue.add("four");
        System.out.println(stringQueue.offer("seven"));
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.element());
        System.out.println(stringQueue.toString());
        System.out.println(stringQueue.offer("done"));
        System.out.println(stringQueue.toString());
        System.out.println(stringQueue);

        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("one");
        stringDeque.add("two");
        stringDeque.add("three");
        stringDeque.add("four");
        stringDeque.add(null);
        stringDeque.push("First element");
        System.out.println(stringDeque.offer("seven"));
        System.out.println(stringDeque.toString());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.size();
    }
}
