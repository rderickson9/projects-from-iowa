
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class Scrabble {

    public static final String fileLoc = "/Users/rderickson9/Desktop/enable1.txt";
    public static final String letterFileLoc = "/Users/rderickson9/Desktop/enable1.txt";
    public static List<String> allWords;
    public static Map<String, Boolean> myDictionary;
    public static Map<Integer, Integer> sizeMap;
    public static List<Integer> lengthOfWords;
    public static Map<Character, Integer> letterValueMap;
    public static Map<Character, Integer> letterCountMap;
    public static List<String> wildLetters;

    //You are free to put whatever tests you like in the main method
    public static void main(String[] args) {
        try {
            importWords();
        } catch (FileNotFoundException ex) {
            System.err.println("Words File not found : " + ex);
        }
        constructDictionary();
        constructSizeMap();

        //Simple Tests
        System.out.println(isValidWord("hey"));
        System.out.println(numWordsBySize(3));
    }

    /*
     Imports all the words from the file and puts them into our word list
     */
    public static void importWords() throws FileNotFoundException {
        allWords = new ArrayList<>();
        File file = new File(fileLoc);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            allWords.add(line);
        }

    }
    /*
     Puts all the words into Hash Map where the keys are the words and the 
     value is the boolean true for each word.  That is, all map entries will have 
     the same value.  Those who know some other Java data
     structures such as HashSet will realize we could've easily used one of those 
     here since we don't actually have different values.
     */

    public static void constructDictionary() {
        myDictionary = new HashMap<>();
        Boolean result = true;
        Iterator a = allWords.iterator();
        while (a.hasNext()) {
            Object i = a.next();
            myDictionary.put(i.toString(), result);

        }

    }

    /*
     Once you have your map constructed, this should tell you whether a given string is a valid word.      
     */
    public static boolean isValidWord(String w) {
        if (myDictionary.containsKey(w)) {
            return true;
        }
        return false;
    }

    /*
     Another way of doing the same thing.  Which is better and why?
     //Your answer here:
    
    
    
     */
    public static boolean isValidWordTwo(String w) {
        for (String s : allWords) {
            if (w.equals(s)) {
                return true;
            }
        }
        return false;
    }

    /*
     This method constructs a map where the keys are integers that represent the length of words and the values
     are the numbers of words of that have that length.  
     */
    public static void constructSizeMap() {
        sizeMap = new HashMap<>();
        lengthOfWords = new ArrayList<>();
        for (String temporary : allWords) {
            lengthOfWords.add(temporary.length());
        }
        for (Integer i : lengthOfWords) {
            Integer times = sizeMap.get(i);
            if (times == null) {
                sizeMap.put(i, 1);

            } else {
                sizeMap.put(i, times + 1);
            }
        }
        System.out.println(sizeMap);

    }

    /*
     This method will return the number of words in the dictionary that have size n
     where n is the parameter of the method.  If you didn't have to handle the case where there 
     are no words of that size, this could just be one line of code.  You should use your size map in this method.
     */
    public static Integer numWordsBySize(int n) {
        if (n == 1 || n == 0){
            return 0;
        }
        int x = sizeMap.get(n);
        return x;
    }
    public static void constructLetterMaps() throws FileNotFoundException{
        letterValueMap = new HashMap<>();
        letterCountMap = new HashMap<>();
        wildLetters = new ArrayList<>();
        File file = new File(letterFileLoc);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] split = line.split(",");
            char letter = split[0].charAt(0);
            int number = Integer.parseInt(split[1]);
            int value = Integer.parseInt(split[2]);
            letterValueMap.put(letter, value);
            letterCountMap.put(letter, number);
            wildLetters.add(split[0]);
            
            
                    
        }
        
    }
    public static int calculateStringValue(String word){
        int pointTotal = 0;
        for (int j = 0; j <word.length(); j++){
            char character = word.charAt(j);
            if (letterValueMap.containsKey(character)){
                pointTotal = pointTotal +letterValueMap.get(character);
            }
            else{
                return -1;
            }
        }
        return pointTotal;
    }
    
    public static boolean printWords(String s){
        //int wildIndex = s.indexOf("*");
        String string1;
        if (s.contains("*")){
            for (int j = 0; j < wildLetters.size()-1; j++){
                string1 = s.replaceFirst("\\*", wildLetters.get(j));
                printWords(string1);
            }
        }
        else {
            if (isValidWordTwo(s) == true){
                System.out.println(s);
            }
        }
    return true;
        
    
        
   
        
    }
    public static boolean printStringsWithValues(List<String> strings){
        for (String string : strings) {
            System.out.println(string + ", " + calculateStringValue(string));
        }
        return true;
    }
    public static List<String> pQSortStrings(List<String> strings){
        
    }
    
}
