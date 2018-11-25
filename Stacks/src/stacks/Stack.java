/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author rderickson9
 */
public interface Stack<E> {
    public int size();
    public boolean isEmpty();
    public E peek();
    public E pop();
    public void push(E e);
    
    
}
