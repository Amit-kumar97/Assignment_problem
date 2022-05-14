
/*
Print string in the zigzag form in `k` rows
Given a string and a positive integer k, print the string in k rows in the zigzag form.

For example,


Zig Zag – 3 rows

Zig Zag – 4 rows

Practice this problem:

The idea is to identify a pattern in the problem. If we consider a character’s index in the output,
we have observed some patterns:
The first key of each row, i, is present at index i in the string.
For the first and the last row, the distance between each key is (k-1)×2. For example, for k = 4, the difference is 6.
So, the first element of the first row is located at index 0;
the second element is located at index 6;
the third element at 12, and so on… Similarly,
the first element of the last row is located at index 3;
the second element is located at index 9,
the third element at 15, and so on…
For all middle rows, depending upon whether we are going up or going down,
the index differs, as evident from the following code:
Zig Zag – 4 rows
 */
public class ZigZag_String {

    // Function to print given string in the zigzag form in `k` rows
    public static void printZigZag(String str, int k)
    {
        // base case
        if (str == null || k == 0) {
            return;
        }

        // base case
        if (k == 1)
        {
            System.out.print(str);
            return;
        }

        // print first row
        for (int i = 0; i < str.length(); i += (k-1)*2) {
            System.out.print(str.charAt(i));
        }

        // print middle rows
        for (int j = 1; j < k - 1; j++)
        {
            boolean down = true;
            for (int i = j; i < str.length();)
            {
                System.out.print(str.charAt(i));
                if (down) {     // going down
                    i += (k - j - 1) * 2;
                }
                else {          // going up
                    i += (k - 1) * 2 - (k - j - 1) * 2;
                }

                down = !down;   // switch direction
            }
        }

        // print last row
        for (int i = k - 1; i < str.length(); i += (k - 1) * 2) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        String str = "THISPROBLEMISAWESOME";
        int k = 4;

        printZigZag(str, k);
    }
}
