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
public class Homework6 {
    public static Stack removeAll(Stack s) {

        if (s.isEmpty()) {
            return s;
        } else {
            s.pop();
            return removeAll(s);
        }
    }
}    

