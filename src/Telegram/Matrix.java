package Telegram;

/*
Change all elements of row `i` and column `j` in a matrix to 0 if cell `(i, j)` is 0
Given an M × N matrix consisting of only 0 or 1, change all elements of row i and column j to 0 if cell (i, j)
has value 0. Do this without using any extra space for every (i, j) having value 0.

For example,

Input:

[ 1  1  0  1  1 ]
[ 1  1  1  1  1 ]
[ 1  1  1  0  1 ]
[ 1  1  1  1  1 ]
[ 0  1  1  1  1 ]

Output:

[ 0  0  0  0  0 ]
[ 0  1  0  0  1 ]
[ 0  0  0  0  0 ]
[ 0  1  0  0  1 ]
[ 0  0  0  0  0 ]

Explanation:

0’s are present at (0, 2), (4, 0), and (2, 3) in the input matrix. So, we change all elements of the following cells to 0:
row 0 and column 2
row 4 and column 0
row 2 and column 3
 */

import java.util.Arrays;

public class Matrix {
    private static void convert(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        int M = mat.length;
        int N = mat[0].length;

        boolean rowFlag = false, colFlag = false;

        for (int j = 0; j < N; j++)
        {
            if (mat[0][j] == 0)
            {
                rowFlag = true;
                break;
            }
        }

        for (int i = 0; i < M; i++)
        {
            if (mat[i][0] == 0)
            {
                colFlag = true;
                break;
            }
        }

        for (int i = 1; i < M; i++)
        {
            for (int j = 1; j < N; j++)
            {
                if (mat[i][j] == 0) {
                    mat[0][j] = mat[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < M; i++)
        {
            for (int j = 1; j < N; j++)
            {
                if (mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        for (int i = 0; rowFlag && i < N; i++) {
            mat[0][i] = 0;
        }

        for (int i = 0; colFlag && i < M; i++) {
            mat[i][0] = 0;
        }
    }

    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 5, 3, 0, 8, 1 },
                        { 8, 1, 8, 4, 7 },
                        { 2, 6, 5, 0, 3 },
                        { 1, 4, 2, 7, 9 },
                        { 0, 1, 3, 6, 5 }
                };

        convert(mat);

        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }
    }
}
