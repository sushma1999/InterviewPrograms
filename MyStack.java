package com.sushma;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack {
    private int[] items=new int [5];
    private int count;

    public void push(int item){
        if(count==items.length)
        {
            throw new StackOverflowError();
        }
        items[count++]=item;
    }
    public int pop(){
        if(items==null)
        {
            throw new NullPointerException();
        }
        return items[--count];
    }
    public int peek(){
        if(count==0)
        {
            throw new NullPointerException();
        }
        return items[count-1];
    }
    @Override
    public String toString(){
        var result= Arrays.copyOfRange(items,0,count);
         return Arrays.toString(result);
    }
    public boolean isEmpty() {
        return count == 0;
    }
}
