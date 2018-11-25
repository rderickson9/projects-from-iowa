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
public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> myStack = new ArrayStack<>();
        myStack.push(4);
        myStack.push(8);
        myStack.push(15);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        Stack s = removeAll(myStack);
        System.out.println(s);
        
        Integer[] arr = {4,8,15,16,23,42};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        String[] array = {"Jack", "Kate", "Hurley","Michael", "Jin"};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
        // (8x * 5) + arr[i] * (5-2));
        String expr = "(8x * 5) + arr[i] * (5-2)";
        System.out.println(isMatched(expr));
        
        expr = "           Stack<E> buffer = new ArrayStack<E>();\n" +
                "    (E[] a){\n" +
                "           for (E e:a){\n" +
                "            buffer.push(e);\n" +
                "            System.out.println(e + \": \" + buffer);\n" +
                "           }\n" +
                "           for (int i = 0; i < a.length; i++){\n" +
                "            a[i] = buffer.pop();\n" +
                "            System.out.println(a[i] + \": \" + buffer);\n" +
                "            \n" +
                "           }\n" +
                "           }";
        System.out.println(isMatched(expr));
    }
    public static <E> void reverseArray(E[] a){
        Stack<E> buffer = new ArrayStack<E>();
        for (E e:a){
            buffer.push(e);
            System.out.println(e + ": " + buffer);
        }
        for (int i = 0; i < a.length; i++){
            a[i] = buffer.pop();
            System.out.println(a[i] + ": " + buffer);
            
        }
    }
    public static Stack removeAll(Stack s){
        
        if(s.isEmpty()){
            return s;
        }
        else{
            s.pop();
            return removeAll(s);  
        }
        
        
    }
    // Parenthesis matching
    // (8x * 5) + arr[i] * (5-2));
   
    
    public static boolean isMatched(String expr){
        String opening = "{[(";
        String closing = "}])";
        Stack<Character> buffer = new ArrayStack<>();
        for (char c:expr.toCharArray()){
            if (opening.indexOf(c) !=-1){
                buffer.push(c);
            }
            else if(closing.indexOf(c) !=-1){
                if (buffer.isEmpty()){
                    return false;
                }
                if (opening.indexOf(buffer.pop()) != closing.indexOf(c)){
                    return false;
                
                    
                }
            if ((opening + closing).indexOf(c) !=-1){
                System.out.println("c: " + buffer);
            }    
            }
            
        }
        return buffer.isEmpty();
                
    }
    
}
