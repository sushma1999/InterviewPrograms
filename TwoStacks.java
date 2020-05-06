package com.sushma;

import java.util.Arrays;

public class TwoStacks {
    private int[] items;
    private int top1;
    private int top2;

    public TwoStacks(int capacity) {
        items = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    public boolean isEmpty1() {
        return (top1 == -1);

    }

    public boolean isFull1() {
        return (top1 + 1 == top2);
    }

    public void push1(int item) {
        if (isFull1()) {
            throw new StackOverflowError();
        }
        items[++top1] = item;
    }

    public int pop1() {
        if (isEmpty1()) {
            throw new NullPointerException();
        }
        return items[top1--];
    }

    public boolean isEmpty2() {
        return (top2 == items.length);
    }

    public boolean isFull2() {
        return (top2 - 1 == top1);
    }

    public void push2(int item) {
        if (isFull2()) {
            throw new StackOverflowError();
        }
        items[--top2] = item;
    }

    public int pop2() {
        if (isEmpty2()) {
            throw new NullPointerException();
        }
        return items[top2++];
    }


    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}