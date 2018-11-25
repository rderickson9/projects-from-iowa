/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author rderickson9
 */
public class Problem3 {

    public static void main(String[] args) {
        String numStr;
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a positive integer");
        numStr = in.nextLine();
        num = Integer.parseInt(numStr);

        int nonPerf = 0;
        for (int i = 0; i < num; i++) {
            if (i * i == num) {
                System.out.println(num + " is a perfect square.");
                nonPerf++;
                break;
            }

        }

        if (nonPerf == 0) {
            System.out.println(num + " is not a perfect square.");
        }

        
    }
}