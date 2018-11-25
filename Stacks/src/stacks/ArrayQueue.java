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
public class ArrayQueue<E> implements Queue<E> {
    
    private static final int CAPACITY = 1000;
    private E[] data;
    private int front = 0;
    private int end = 0;
    private int size;
    
    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }
    
    public ArrayQueue(){
        this(CAPACITY);
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    
    public E first(){
        if (isEmpty()){
            return null;
        }
        return data[front];
    }
    public E dequeue(){
        if (isEmpty()){
            return null;
        }
        E value = data[front];
        front = (front+1)%data.length;
        return value;
        
    }
    @Override
    public void enqueue(E e) throws IllegalStateException{
        
        if(size() == data.length){
            throw new IllegalStateException("Queue is full");
            //int n = data.length;
            //data = Arrays.copyOf(n, 2*n);
        }
        int nextInLine = (front+size)%(data.length);
        
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = front; i>=0;i--){
                sb.append(data[i]);
                sb.append(" ");
            }
        return sb.toString();    
        
    }
}

