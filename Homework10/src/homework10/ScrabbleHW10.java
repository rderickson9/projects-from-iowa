
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class ScrabbleHW10 {

    public static final String fileLoc = "/Users/rderickson9/Desktop/enable1.txt";
    public static List<String> allWords;
    public static Map<String, Boolean> myDictionary;
    public static Map<Integer, Integer> sizeMap;

    public static final String letterFileLoc = "/Users/rderickson9/Desktop/wwf";
    public static Map<Character, Integer> letterValueMap;
    public static Map<Character, Integer> letterCountMap;
    
    public static Map<Integer, List<String>> wordsBySizeMap;

    public static void main(String[] args) {
        try {
            importWords();
            constructDictionary();
            constructLetterMaps();
            constructSizeMap();
            List<String> test = new ArrayList<>();
            test.add("hello");
            test.add("4523!#@");
            test.add("xylophone");
            System.out.println(getKey("bat"));
            System.out.println(getKey("tab"));
            System.out.println(getKey("bta"));
            printStringsWithValues((test));
            printStringsWithValues(pQSortStrings(test));
            printWords("**pl*");
            System.out.println(numWordsBySize(7));
            System.out.println(numWordsBySize(37));
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex);
        }
    }


    
    public static void constructLetterMaps() throws FileNotFoundException {
        letterValueMap = new HashMap<>();
        letterCountMap = new HashMap<>();
        File f = new File(letterFileLoc);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String[] strArr = sc.nextLine().split(",");
            Character c = strArr[0].charAt(0);
            Integer count = Integer.valueOf(strArr[1]);
            Integer value = Integer.valueOf(strArr[2]);
            letterCountMap.put(c, count);
            letterValueMap.put(c, value);
        }
    }

    public static int calculateStringValue(String word) {
        if (word==null){
            return -1;
        }
        int total = 0;
        for (Character c : word.toCharArray()) {
            Integer value = letterValueMap.get(c);
            if (value == null) {
                return -1;
            }
            total += value;
        }
        return total;
    }

    /*
     Imports all the words from the file and puts them into our word list
     */
    public static void importWords() throws FileNotFoundException {
        allWords = new ArrayList<>();
        File f = new File(fileLoc);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            allWords.add(sc.nextLine());
        }
    }
    /*
     Puts all the words into Hash Map where the keys are the words and the 
     value is the boolean true for each word.  Those who know some other data
     structures such as HashSet will realize we could've easily used one of those 
     here since we don't actually have different values.
     */

    public static void constructDictionary() {
        myDictionary = new HashMap<>();
        for (String w : allWords) {
            myDictionary.put(w, Boolean.TRUE);
        }
    }
    /*
     Once you have your map constructed, this should tell you whether a given string is a valid word.
     This method is complete, but you should look to make sure you understand it.
     */
    public static boolean isValidWord(String w) {
        if (myDictionary.containsKey(w)) {
            return true;
        }
        return false;
    }

    //prints words with these exact characters in roder
    public static boolean printWords(String s) {
        boolean valid = false;
        if (isValidWord(s)) {
            System.out.println(s);
            valid = true;
        }
        if (s.contains("*")) {
            for (Character c : letterValueMap.keySet()) {
                if (c != '*') {
                    String replacement = s.replaceFirst("\\*", "" + c);
                    valid = (printWords(replacement)||valid);
                }
            }
        }
        return valid;
    }

    /*
     This method constructs a map where the keys are integers that represent the length of words and the values
     are the numbers of words of that have that length.  
     */
    public static void constructSizeMap() {
        sizeMap = new HashMap<>();
        for (String w : allWords) {
            int size = w.length();
            if (!sizeMap.containsKey(size)) {
                sizeMap.put(size, 0);
            }
            sizeMap.put(size, sizeMap.get(size) + 1);
        }
    }

    /*
     This method will return the number of words in the dictionary that have size n
     where n is the parameter of the method.  If you didn't have to handle the case where there 
     are no words of that size, this could just be one line of code.  You should use your size map in this method.
     */
    public static Integer numWordsBySize(int n) {
        return ((sizeMap.get(n)==null) ? 0 : sizeMap.get(n));
    }

    public static boolean printStringsWithValues(List<String> strings) {
        if (strings == null) {
            System.out.println("Null String list");
            return false;
        }   
        List<String> listToReturn = new ArrayList<>();
        PriorityQueue<String> pQ = new PriorityQueue<>(strings.size(),new StringValueComparator());
        for (String s:strings){
            pQ.add(s);
        }
        while (!pQ.isEmpty()){
            listToReturn.add(pQ.poll());
        }
        
        for (String s : listToReturn) {
            System.out.println(s + ", " + calculateStringValue(s));
        }
        return true;
    }

    public static List<String> pQSortStrings(List<String> strings){
        List<String> listToReturn = new ArrayList<>();
        PriorityQueue<String> pQ = new PriorityQueue<>(strings.size(),new StringValueComparator());
        for (String s:strings){
            pQ.add(s);
        }
        while (!pQ.isEmpty()){
            listToReturn.add(pQ.poll());
        }
        return listToReturn;
    }
    
    public static class StringValueComparator implements Comparator<String>{     
        public int compare(String s1, String s2){
            return calculateStringValue(s2)-calculateStringValue(s1);
        }
    }
    
    public static Integer getKey(String s){
        //Im checking its value of each letter and returning its total value
        //this question wasn't clear so this is the route I'm going
        int total = 0;
        for (Character c : s.toCharArray()) {
            Integer value = letterValueMap.get(c);
            if (value == null) {
                return -1;
            }
            total += value;
        }
        return total;
    }
}