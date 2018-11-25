
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rderickson9
 */
public class Homework5 {
    public static void main(String[] args) {
        List x = new ArrayList();
        x.add(0,2);
        x.add(1,2);
        x.add(2,"what");
        System.out.println(x);
        //int[] arr = {1,5,23,2,1,6,1,8,12,3,12};
        //printRepeats(arr);
        //System.out.println(recMultiply(5,3));
        
    }
    
    public static int recMultiply(int x, int y){
        if ((x>0) && (y>0)){
            return recMultiply(x, y-1) + x;
        }
        else{
            return 0;
        }
        
    }
    public static void printRepeats(int[] arr){
        
        Arrays.sort(arr);
        for (int i = 1; i <arr.length; i++){
            if(arr[i] == arr[i-1]){
                System.out.println("A duplicate is: " + arr[i]);
            }
        }
    }
}
