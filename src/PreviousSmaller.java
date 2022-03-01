package Stack;

import java.util.Stack;

                              //============================STACK======================//

/*
Given an integer array, find the previous smaller element for every array element. The previous smaller element of a 
number x is the first smaller number to the left of x in the array.

In other words, for each element A[i] in the array A, find an element A[j] such that j < i and A[j] < A[i] and 
value of j should be as maximum as possible. If the previous smaller element doesn't in the array for any element, 
consider it -1.

For example,
Input:  [2, 5, 3, 7, 8, 1, 9]
Output: [-1, 2, 2, 3, 7, -1, 1]
  
Input:  [5, 7, 4, 9, 8, 10]
Output: [-1, 5, -1, 4, 4, 8]
 */
public class PreviousSmaller {

    //----------Find the previous smaller element for every array element
    public static void findPrevSmaller(int[] arr)
    {
        //---------base case
        if (arr == null || arr.length == 0) {
            return;
        }

        //---------create a stack
        Stack<Integer> s = new Stack<>();

        //-------do for each element
        for (int i = 0; i < arr.length; i++)
        {
            //----------loop till stack is empty
            while (!s.empty())
            {
                //---------If the stack's top element is less than the current element,it is the previous smaller element
                if (s.peek() < arr[i])
                {
                    System.out.print(s.peek() + " ");
                    break;
                }
                //--------------remove the stack's top element is less if it is greater or equal to the current element
                else {
                    s.pop();
                }
            }

            //------------------If the stack becomes empty, all elements to the left of the current element are greater
            if (s.empty()) {
                System.out.print(-1 + " ");
            }

            //-----------------push current element into the stack
            s.push(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 3, 7, 8, 1, 9 };
        findPrevSmaller(arr);
    }
}
