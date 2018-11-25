/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//I need to add the letters to the index of the character list 
//

/**
 *
 * @author rderickson9
 */
public class Problem1 {

    

    //finding how long the new char array will be
    public static char[] fillSpace(char[] input) {
        int space = 0;
        int length = 0;
        for (char ch : input) {
            if (ch == ' ') {

                length = length + 3;

            } else {
                length++;
            }
        }
        char[] total = new char[length];

        int j = 0;
        for (int i = 0; input.length > i; i++) {

            if (input[i] == ' ') {

                total[j] = 'B';
                total[j + 1] = 'e';
                total[j + 2] = 'n';
                j = j + 3;

                System.out.println(total);
            } else {

                char a = input[i];
                total[j] = a;
                j = j + 1;

            }
        }
        System.out.println(total);
        return total;
    }

}
