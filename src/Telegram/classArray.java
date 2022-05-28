package Telegram;

import java.util.Scanner;

public class classArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //size of Array
        int n = sc.nextInt();
        //Array Declaration
        int[] ar = new int[n];

        //getting elements in array
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        //for Storing max sum
        int maxSum = 0;
        //foreach loop to traverse Array
        for (int res:ar) {
            maxSum += res;
        }

        System.out.println(maxSum);
    }
}
