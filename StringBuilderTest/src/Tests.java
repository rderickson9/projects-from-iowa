/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
/**
 *
 * @author rderickson9
 */
public class Tests {
    public static void main(String[] args) {
        
        int n = 5;
        
        System.out.println(lg(n));
        //  lg(2n) = lg(n)+lg(2) = lg(n) + 1
        System.out.println(lg(10));
    }
    // log base 2
    public static double lg(double d){
        return Math.log(d)/Math.log(2);
        
    }
    
}
