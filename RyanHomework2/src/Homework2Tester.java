/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rderickson9
 */
public class Homework2Tester {
    public static void main(String[] args) {
        int[] inputOne = {4, 8, 9, 12, 7};
        int[] inputTwo = {41, 38, 19, 112, 705};
        System.out.println("Problem 1 is correct on test input = " + (16 == Problem1.addOdds(inputOne)));
        System.out.println("Problem 2 is correct on test input = " + (686== Problem2.getRange(inputTwo)));
        
    }
    
}
