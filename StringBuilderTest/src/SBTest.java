/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rderickson9
 */
public class SBTest {
    public static void main(String[] args) {
        //String s1 = stringTest(1000);
        //String s2 = sBTest(1000);
        for (int i = 1; i <6; i++){
            double d = Math.pow(10, i);
            String s1 = stringTest((int)d);
            String s2 = sBTest((int)d);
        }
    }
    public static String stringTest(int n){
        long start = System.currentTimeMillis();
        String s = "s";
        for (int  i = 0; i < n; i++){
            s+="a";
        }
        long end = System.currentTimeMillis();
        System.out.println(n + " "+ (end-start) + " stringTest");
        return s;
    }
    
    public static String sBTest(int n){
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< n; i++){
            sb.append("a");
            
        }
        long end = System.currentTimeMillis();
        System.out.println(n  + " "  + (end-start) + "sBTest");
        return sb.toString();
    }
}
