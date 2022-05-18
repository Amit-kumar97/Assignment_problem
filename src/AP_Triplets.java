/*
Print all triplets that form an arithmetic progression
Given a sorted array of distinct positive integers, print all triplets that forms an arithmetic progression with
an integral common difference.

An arithmetic progression is a sequence of numbers such that the difference between the consecutive terms is constant.
For instance, sequence 5, 7, 9, 11, 13, 15, … is an arithmetic progression with a common difference of 2.


For example,

Input:  A[] = { 5, 8, 9, 11, 12, 15 }

Output:
5 8 11
9 12 15


Input:  A[] = { 1, 3, 5, 6, 8, 9, 15 }

Output:
1 3 5
1 5 9
3 6 9
1 8 15
3 9 15
 */
public class AP_Triplets {
    public static void findAllTriplets(int[] A)
    {
        if (A.length < 3) {
            return;
        }

        for (int j = 1; j < A.length - 1; j++)
        {
            int i = j - 1, k = j + 1;

            while (i >= 0 && k < A.length)
            {
                if (A[i] + A[k] == 2 * A[j])
                {
                    System.out.println(A[i] + " " + A[j] + " " + A[k]);
                    k++; i--;
                }
                else if (A[i] + A[k] < 2 * A[j]) {
                    k++;
                }
                else {
                    i--;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 3, 5, 6, 8, 9, 15 };

        findAllTriplets(A);
    }
}
