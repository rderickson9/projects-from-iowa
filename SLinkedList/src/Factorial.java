/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *          5! = 5*4*3*2*1
 * 
 * @author rderickson9
 */
public class Factorial {
    
    public static void main(String[] args) {
        System.out.println(fact(5));
        long startTime = System.nanoTime();
        System.out.println(fact2(10));
        long finishTime = System.nanoTime();
        long start = System.nanoTime();
        System.out.println(tailFact(10));
        long finish = System.nanoTime();
        System.out.println(finishTime- startTime);
        System.out.println(finish- start);
    }
    public static int fact(int n){
        if (n<=1){
            return 1;
        }
        int fact = 1;
        for (int i=2;i<=n;i++){
            fact*=i;
                       
        }
        return fact;
    }
    
    public static int fact2(int n){
        if (n<=1){
            return 1;
        }
        return n*fact2(n-1);
    }
    public static int tailFact(int n, int accum){
        if (n<=1){
            return accum;
        }
        else{
            accum *= n;
            return tailFact(n-1, accum);
        }
    }
    public static int tailFact(int n){
        return tailFact(n,1);
    }
}

