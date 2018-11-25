/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rderickson9
 */
public class EnumNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int month1;
      month1 = 2;
      MONTH month2 = MONTH.MAY;
      
      String season1 = seasonOf(month1);
      String season2 = seasonOf(month2);
      
      System.out.println("season of month1 is: " + season1);
      System.out.println("season of month2 is: " + season2);
    }
    
    public enum MONTH{
        JAN, FEB, MAR,
        APR, MAY, JUN,
        JUL, AUG, SEP,
        OCT, NOV, DEC
    }
    public static String seasonOf(int mon){
        if (mon == 3 || mon == 4 || mon == 5) {
                return "Spring";
                }
        return null;
    }
               
    public static String seasonOf(MONTH mon) {
        if (mon == MONTH.MAR || mon == MONTH.APR || mon == MONTH.MAY ) {
            return "Spring";
        }                    
        else if (mon == MONTH.JUN || mon == MONTH.JUL || mon == MONTH.AUG) {
            return "SUMMER";
        }         
        else if (mon == MONTH.SEP || mon == MONTH.OCT || mon == MONTH.NOV) {
            return "AUTUMN";
         
        }                 
        else if (mon == MONTH.DEC || mon == MONTH.JAN || mon == MONTH.FEB) {
            return "WINTER";
        } 
        return null;
}
