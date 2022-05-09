import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an integer array, find all distinct combinations of a given length k.

For example,

Input:  {2, 3, 4}, k = 2
Output: {2, 3}, {2, 4}, {3, 4}


Input:  {1, 2, 1}, k = 2
Output: {1, 2}, {1, 1}, {2, 1}
The program should print all the distinct combinations, while preserving
the relative order of elements as they appear in the array.
 */
public class Subsets {


    // Function to print all distinct combinations of length `k`
    public static void findCombinations(int[] A, int i, int k,
                                        Set<List<Integer>> subarrays, List<Integer> out)
    {
        // do nothing for empty input
        if (A.length == 0) {
            return;
        }

        // base case: combination size is `k`
        if (k == 0) {
            subarrays.add(new ArrayList<>(out));
            return;
        }

        // return if no more elements are left
        if (i < 0) {
            return;
        }

        // include the current element in the current combination and recur
        out.add(A[i]);
        findCombinations(A, i - 1, k - 1, subarrays, out);

        // exclude the current element from the current combination
        out.remove(out.size() - 1);

        // exclude the current element from the current combination and recur
        findCombinations(A, i - 1, k, subarrays, out);
    }

    public static Set<List<Integer>> findCombinations(int[] A, int k)
    {
        Set<List<Integer>> subarrays = new HashSet<>();
        findCombinations(A, A.length - 1, k, subarrays, new ArrayList<>());
        return subarrays;
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3 };
        int k = 2;

        // process elements from right to left
        System.out.println(findCombinations(A, k));
    }
}
