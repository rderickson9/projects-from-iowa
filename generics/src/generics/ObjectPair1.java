/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author bmccune
 */
public class ObjectPair1 {
    Object first;
    Object second;
    
    public ObjectPair1(Object a, Object b){
        first = a;
        second = b;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }
    
    public void printClasses(){
        System.out.println(first.getClass());
        System.out.println(second.getClass());
    }
    
    public static void main(String[] args) {

        
    }
    
    
}