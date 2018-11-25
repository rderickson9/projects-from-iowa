import java.io.File;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bmccune
 */
public class Recursion {

    public static int numCalls = 0;

    public static void main(String[] args) {
        Random rand = new Random();
        int[] myArr = new int[25];
        int[] indexArr = new int[25];
        for (int i = 0; i < myArr.length; i++) {
            indexArr[i] = i;
            myArr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(myArr));
        Arrays.sort(myArr);
        //System.out.println(Arrays.toString(indexArr));
        System.out.println(Arrays.toString(myArr));
        System.out.println(binSearch(myArr, 50));
        //System.out.println(numCalls);
        revArr(myArr);
        System.out.println(Arrays.toString(myArr));
        
        File file = new File(System.getProperty("user.dir"));
        diskUsage(file);
    }

    public static boolean binSearch(int[] arr, int value, int start, int end) {
        System.out.println(++numCalls + " call, searching between " + start + " and " + end);
        if (start > end) {
            return false;
        } else {
            int mid = (start + end) / 2;
            if (value == arr[mid]) {
                return true;
            } else if (value < arr[mid]) {
                return binSearch(arr, value, start, mid - 1);
            } else {
                return binSearch(arr, value, mid + 1, end);
            }
        }
    }

    public static boolean binSearch(int[] arr, int value) {
        numCalls = 0;
        return binSearch(arr, value, 0, arr.length - 1);
    }

    public static void revArr(int[] arr, int start, int finish) {
        if (start >= finish) {
            return;
        } else {
            int temp = arr[start];
            arr[start] = arr[finish];
            arr[finish] = temp;
            revArr(arr, start + 1, finish - 1);
        }
    }

    public static void revArr(int[] arr) {
        revArr(arr, 0, arr.length - 1);
    }

    public static long diskUsage(File root) {
        long total = root.length();
        if (root.isDirectory()) {
            System.out.println();
            for (String childName : root.list()) {
                File child = new File(root, childName);
                total += diskUsage(child);
            }
        }
        System.out.println(total + "\t" + root);
        return total;
    }
}