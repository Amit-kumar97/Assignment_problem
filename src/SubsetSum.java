
/*
Given a set of positive integers and an integer k, check if there is any non-empty subset that sums to k.

For example,

Input:

A = { 7, 3, 2, 5, 8 }
k = 14

Output: Subset with the given sum exists

Subset { 7, 2, 5 } sums to 14
 */

public class SubsetSum {
    // Returns true if there exists a subsequence of array `A` with the given sum
    public static boolean subsetSum(int[] A, int k)
    {
        int n = A.length;

        // `T[i][j]` stores true if subset with sum `j` can be attained
        // using items up to first `i` items
        boolean[][] T = new boolean[n + 1][k + 1];

        // if the sum is zero
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
        }

        // do for i'th item
        for (int i = 1; i <= n; i++)
        {
            // consider all sum from 1 to sum
            for (int j = 1; j <= k; j++)
            {
                // don't include the i'th element if `j-A[i-1]` is negative
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                }
                else {
                    // find the subset with sum `j` by excluding or including
                    // the i'th item
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }

        // return maximum value
        return T[n][k];
    }

    public static void main(String[] args)
    {
        // Input: a set of items and a sum
        int[] A = { 7, 3, 2, 5, 8 };
        int k = 18;

        if (subsetSum(A, k)) {
            System.out.println("Subsequence with the given sum exists");
        }
        else {
            System.out.println("Subsequence with the given sum does not exist");
        }
    }
}
