/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Problem2 {
    
    public static final String filePath = "/Users/rderickson9/Desktop/CS2/fileAverage";
    
    public static double fileAverage(String filePath){
        int total = 0;
        double fin = 0.0;
        double avg = 0;
        
        
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while((line = bufferedReader.readLine()) != null){
                
                double value = Double.parseDouble(line);
                fin = fin + value;
                
                
                
                total++; 
            }
            avg = (fin/total);
            System.out.println(avg);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Problem2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Problem2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return avg;
    }
    
}

 