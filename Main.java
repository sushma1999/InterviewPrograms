package com.sushma;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
    public class Main {
        public static void main(String[] arg) {
            ArrayQueue queue = new ArrayQueue(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            var front = queue.dequeue();
            System.out.println(front);
            var output = queue;
            var outputString = queue.toString();
            System.out.println(queue);
        }  }