
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bmccune
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> freq = new HashMap<>();

        File file = new File("/Users/rderickson9/Desktop/CS2/wordCount");
        Scanner doc = new Scanner("");
        try {
            doc = new Scanner(file).useDelimiter("[^a-zA-Z]+");
        } catch (FileNotFoundException ex) {
            System.err.println("exception + " + ex);
        }

        while (doc.hasNext()) {
            String word = doc.next().toLowerCase();
            Integer count = freq.get(word);
            if (count == null) {
                count = 0;
            }
            freq.put(word, count + 1);
            //System.out.println("**"+word+"**" );
        }
        String maxWord = "no word";
        int maxCount = 0;
        for (String key : freq.keySet()) {
            if (freq.get(key) > maxCount) {
                maxCount = freq.get(key);
                maxWord = key;
            }
            if (freq.get(key) > 1000) {
                //System.out.println(key);
            }
        }
        System.out.println(maxWord);
        System.out.println(freq.get(maxWord));

        String word = "hey";
        String word1 = "help";
        System.out.println(word + " count = " + (freq.get(word)));
        System.out.println(word1 + " count = " + (freq.get(word1)));
    }

}
