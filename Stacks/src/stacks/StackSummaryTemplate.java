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
public interface StackSummaryTemplate<E> {
    /**
     * Should push element onto the implemenation's stack
     * @param e 
     */
    public void push(E e);
    /**
     * Should pop the stack 
     */
    public void pop();
    /**
     * Should peek at the stack
     */
    public void peek();
    
    /**
     * Should return the number of times push has been called
     * @return 
     */
    //public int getNumPushes();
    /**
     * Should return the number of times peek has been called
     * @return 
     */
    //public int getNumPeeks();
    /**
     * Should return the number of times pop has been called        
     * @return 
     */
    //public int getNumPops();
    /**
     * Should return the number of times pop has been called and a null was returned
     * @return 
     */
    //public int getNumNullPops(); 
}
