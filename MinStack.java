package com.sushma;


import java.util.Arrays;
import java.util.Stack;

public class MinStack {
private MyStack stack =new MyStack();
private MyStack minStack =new MyStack();

public void push(int item){
    stack.push(item);
    if(minStack.isEmpty()){
        minStack.push(item);
    }else if(item<minStack.peek()){
        minStack.push(item);
    }

}

public int pop(){
    if(stack.isEmpty()){
        throw new NullPointerException();
    }
    var top= stack.pop();
    if(minStack.peek()==top){
        minStack.pop();
    }
    return top;
}
public int min(){
    return minStack.peek();
}









}