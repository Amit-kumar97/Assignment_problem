package ArrayLists;

/*
Find the smallest missing positive number from an unsorted array
Given an unsorted integer array, find the smallest missing positive integer in it.

For example,

Input:  {1, 4, 2, -1, 6, 5}
Output: 3

Input:  {1, 2, 3, 4}
Output: 5
 */

public class MissingPositive
{
    //---------Utility function to swap elements `nums[i]` and `nums[j]` in array `nums`
    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //--------Linear time routine for partitioning step of Quicksort
    public static int partition(int[] nums)
    {
        int pIndex = 0;

        //--------each time we find a positive number, `pIndex` is incremented, and that element would be placed before the pivot
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > 0)    {    // pivot is 0
                swap(nums, i, pIndex);
                pIndex++;
            }
        }

        //-------return index of the first non-positive number
        return pIndex;
    }

    //------------Function to find the smallest missing positive number from an unsorted array
    public static int findSmallestMissing(int[] nums)
    {
        int k = partition(nums);

        //---------Case 1. The missing number is in range 1 to k

        //---------do for each array element
        for (int i = 0; i < k; i++)
        {
            //-----------get the value of the current element
            int val = Math.abs(nums[i]);

            //-----------make element at index `val-1` negative if it is positive
            if (val-1 < k && nums[val-1] >= 0) {
                nums[val-1] = -nums[val-1];
            }
        }

        //----------check for missing numbers from 1 to k
        for (int i = 0; i < k; i++)
        {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        //------------Case 2. If numbers from 1 to k are present in the array,then the missing number is `k + 1` e.g. {1, 2, 3, 4} —> 5

        return k + 1;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 9, 2, -1, 6, 5 };

        System.out.println("The smallest positive missing number is " +
        findSmallestMissing(nums));
    }
}
