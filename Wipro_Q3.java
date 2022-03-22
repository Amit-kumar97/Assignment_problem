import java.util.Scanner;

/*
Problem Statement=================================Left Rotations===============================

A left rotation operation on an array shifts each of the array’s elements unit to the left. For example, if 2 left
rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].

Given an array of integers and a number,perform left rotations on the array. Return the updated array to be
printed as a single line of space-separated integers.

Function Description:
Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):

An array of integers .
An integer , the number of rotations.

Input Format:
The first line contains two space-separated integers and , the size of and the number of left rotations you must perform.

The second line contains space-separated integers a[i].

Output Format:
Print a single line of space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input:
5 4
1 2 3 4 5

Sample Output:
5 1 2 3 4

Explanation:
When we perform d=4 left rotations, the array undergoes the following sequence of changes:

[1,2,3,4,5] → [2,3,4,5,1] → [3,4,5,1,2] → [4,5,1,2,3] → [5,1,2,3,4]

Test Case : 1

Input (stdin):
5 4
1 2 3 4 5

Expected Output:
5 1 2 3 4

Test Case : 2

Input (stdin):
20 10
41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51

Expected Output:
77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77
 */
public class Wipro_Q3 {

    public static int[] leftrotate(int ar[],int rotations)
    {
        int temp,j;
        for(int i=0; i<rotations; i++)
        {
            temp = ar[0];
            for(j=0; j<ar.length-1; j++)
                ar[j] = ar[j+1];
            ar[j] = temp;
        }
        return ar;
    }

    public static void print(int ar[])
    {
        System.out.println("Array After Left Rotate:");
        for (int res:ar) {
            System.out.print(res+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter Number of Left Rotations:");
        int rotations = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter Array's Elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        leftrotate(ar,rotations);
        print(ar);
    }
}
