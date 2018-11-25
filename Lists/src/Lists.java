/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author rderickson9
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lList = new LinkedList<>();
        List<Integer> aList = new ArrayList<>();
        
        int n = 5;
        for (int i = 0; i<n; i++){
            lList.add(0,i*i);
            
        }
        System.out.println(lList);
        for (Integer L:lList){
            System.out.print(L + " ");
            if (L%2==1){
                lList.remove(L);
            }
        }
        
        
        // TODO code application logic here
    }
    
}
