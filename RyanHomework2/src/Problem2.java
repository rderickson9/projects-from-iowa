/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rderickson9
 */
public class Problem2 {
    public static int getRange(int[] input){
        int min = input[0];
        int max = input[0];
        int fin = 0;
        for(int i = 0; i < input.length; i++){
            if(min>=input[i]){
                min = input[i];
            }
            if(max<=input[i]){
                max = input[i];     
            }
        fin = max - min;
        //System.out.println(fin);
        
        }
        
        return fin;
        
        
    }

}
