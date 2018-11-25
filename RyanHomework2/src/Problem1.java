/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rderickson9
 */
public class Problem1 {
    public static int addOdds(int[] input){     
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            if (input[i]%2 == 1){
                sum = sum + input[i];
                
                
            }
            
        }
        
        //Enter your code here
        
        return sum;//your actual answer, not zero should be returned
    }
    
}
