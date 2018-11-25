
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author bmccune
 */
public class Homework7 {


    public static int a = 3;
    public static int b = 5;
    public static int N = 11;//size of the Hash Table

    
    public static void main(String[] args) {
        // You can test in here
        List<Integer> keys = new ArrayList<>();
        keys.add(3);
        keys.add(5);
        keys.add(7);
        System.out.println(keys);
        printHashTable(keys);
    }
    
    //should return (a*key + b) mod N
    public static int hash(int key){
        int answer = ((a*key)+b) %N;
        return answer;
    }
    
    /* Prints out the index from 0 to N-1, followed by the keys stored at that location in the hash table*/
    public static void printHashTable(List<Integer> keys){
        for (int i = 0; i < N; i++){
            String answer = "";
            for (int y = 0; y < keys.size(); y++){
                if (hash(keys.get(y)) == i){
                    if (answer == ""){
                        answer += keys.get(y);
                    }
                    else{
                        answer += ", " + keys.get(y);
                    }
                }
            }
            System.out.println(i + " " + answer);
        }
        
    }
    
        
    /*
        Your answer to Homework Question #3
    n^2
        
    
    
    
    */
    
    /*
        Your answer to Homework Question #4
    seperate chaining 
        
    
    
    
    */
    
}