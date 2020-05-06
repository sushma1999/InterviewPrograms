package com.sushma;

import javax.swing.*;

public class LinkedList {
    private class Node{
        private int _value;
        private Node next;
        public  Node(int value){
            this._value=value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (first==null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (first==null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    //10->20->30->40

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current._value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (first==null)
            return;

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (first==null)
           return;

        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index] = current._value;
            index=index + 1;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if (first==null) return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (first==null)
            throw new IllegalStateException();

        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a._value;
    }
    public void printMiddle() {
        if (first==null)
            throw new IllegalStateException();

        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            System.out.println(a._value);
        else
            System.out.println(a._value + ", " + a.next._value);
    }
    public boolean hasLoop() {
        var slow = first;
        var fast = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
    public static LinkedList createWithLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        var node = list.last;

        list.addLast(40);
        list.addLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }
    public void print(){
        var currentNode = first;
        while (currentNode.next !=null) {
        System.out.println(currentNode._value);
        currentNode = currentNode.next;
        }
        }
    }

