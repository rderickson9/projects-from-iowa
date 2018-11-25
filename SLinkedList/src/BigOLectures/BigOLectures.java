/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigOLectures;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author bmccune
 */
public class BigOLectures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rand = new Random();

        double[] myArr = new double[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = Math.floor(100 * rand.nextDouble());
        }

        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(prefixAverage(myArr)));
        System.out.println(Arrays.toString(prefixAverageLin(myArr)));
        
        
        int n = 32;

        //implicit cast
        System.out.println(lg(n)+1);
        System.out.println(intPow(2,n));
        System.out.println(intPowLin(2,n));
        int [] arr = {5,34,7,22};
        int [] arr2 = {25,22,2,22};
        System.out.println(unique(arr));
        System.out.println(unique(arr2));
    }

    public static double lg(double d) {
        return Math.log(d) / Math.log(2);
    }

    //quadratic prefix average
    public static double[] prefixAverage(double[] param) {
        int n = param.length;
        double[] avg = new double[n];

        for (int i = 0; i < n; i++) {
            double total = 0;
            for (int j = 0; j <= i; j++) {
                total += param[j];
            }
            avg[i] = total / (i + 1);
        }
        return avg;
    }

    public static double[] prefixAverageLin(double[] param) {
        int n = param.length;
        double[] avg = new double[n];
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += param[i];
            avg[i] = total / (i + 1);
        }
        return avg;
    }
    
    public static long intPow(long base, int n){
        System.out.println("intPow called");
        if (n<=0){
            return 1;
        }    
        if (n==1){
            return base;
        }
        if (n%2==0){
            return intPow(base*base,n/2);
        }
        else{
            return base*intPow(base*base,n/2);
        }
    }
    
    public static long intPowLin(long base, int n){
        long result = 1;
        for (int i = 0; i <n;i++){
           result *= base;
        }
        return result;
    }
    public static boolean unique(int [] arr){
        if (arr.length<=1){
            return true;
        }
        for (int i =0;i<arr.length-1;i++){
            for(int j = i+1;i<arr.length ;j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
            
        }
        return true;
    }
}