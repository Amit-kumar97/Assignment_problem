import java.util.Arrays;

/*
Segregate positive and negative integers in linear time.
Given an array of positive and negative integers, segregate them in linear time and constant space.
The output should print all negative numbers, followed by all positive numbers.

For example,

Input:  [9, -3, 5, -2, -8, -6, 1, 3]
Output: [-3, -2, -8, -6, 5, 9, 1, 3]
 */

public class SegregateArray {
    public static void partition(int[] a)
    {
        int pIndex = 0;

        // each time we find a negative number, `pIndex` is incremented,and that element would be placed before the pivot
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)    // pivot is 0
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
    }

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] a = { 9, -3, 5, -2, -8, -6, 1, 3 };

        partition(a);
        System.out.println(Arrays.toString(a));
    }
}
