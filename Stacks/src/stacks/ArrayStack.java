/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Arrays;

/**
 *
 * @author rderickson9
 */
public class ArrayStack<E> implements Stack<E> {
    
    private static final int CAPACITY = 1000;
    private E[] data;
    private int top=-1;
    
    public ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }
    
    public ArrayStack(){
        this(CAPACITY);
    }
    
    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    
    public E peek(){
        if (isEmpty()){
            return null;
        }
        return data[top];
    }
    public E pop(){
        if (isEmpty()){
            return null;
        }
        E value = data[top];
        data[top] = null;
        top--;
        return value;
        
    }
    
    public void push(E e){
        
    if(size() == data.length){
        throw new IllegalStateException("Stack is full");
        //int n = data.length;
        //data = Arrays.copyOf(n, 2*n);
    }
    top++;
    data[top] = e;
}
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = top; i>=0;i--){
                sb.append(data[i]);
                sb.append(" ");
            }
        return sb.toString();    
        
    }
    
}

