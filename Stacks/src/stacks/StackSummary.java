/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;



/**
 *
 * @author rderickson9
 * @param <E>
 */
public class StackSummary<E> implements StackSummaryTemplate<E>{
    
    private static final int CAPACITY = 1000;
    private E[] data;
    private int top=-1;
    
    public StackSummary(int capacity){
        data = (E[]) new Object[capacity];
    }
    
    public StackSummary(){
        this(CAPACITY);
    }
    
    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    
    public void peek(){
        if (isEmpty()){
            null;
        }
        data[top];
    }
    public void pop(){
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
    
      
        
    }