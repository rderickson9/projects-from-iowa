/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author bmccune
 */
public class queues {
    public static void main(String[] args) {
        ArrayQueue<Integer> myQ = new ArrayQueue<>();
        myQ.enqueue(5);
        myQ.enqueue(23);
        System.out.println(myQ);
        for (int i = 0; i<10;i++){
            myQ.enqueue(i*i);
        }
        System.out.println(myQ);
        myQ.dequeue();
        System.out.println(myQ);
        
        Queue<Integer> q = new ArrayQueue<>();
        
        q.enqueue(434);
        q.enqueue(54);
        q.enqueue(43);
        System.out.println(q.first());
        q.dequeue();
        System.out.println(q);
    }
}