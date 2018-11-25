/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bmccune
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ObjectPair1 objPair = new ObjectPair1(555, "hello");
        
        objPair = new ObjectPair1(true,'a');
        
        
        
        Pair<Integer,String> pair = new Pair<Integer,String> (47,"yes");
        
        //This uses object
        pair = new Pair(45.3,"yahoo");
        //pair = new Pair<Integer,String>(45.3,"yahoo");
        //pair = new Pair<>(45.3,"yahoo");//type inerence
        
        pair = new Pair(16,"hello");
        
        objPair.printClasses();
        
        List<String> myLList = new LinkedList<>();
        List<String> myAList = new ArrayList();
        
        myLList.add("hey");
        myLList.add("you");
        myLList.add("there");
        System.out.println(myLList);
        myAList.add("hey");
        myAList.add("you");
        //myAList.add(43);
        System.out.println(myAList);
        
    }
    
}