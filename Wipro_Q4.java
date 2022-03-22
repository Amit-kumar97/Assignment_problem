/*
Program to check if two given matrices are identical.
 */

public class Wipro_Q4 {

    public static boolean identical(int a[][],int b[][])
    {
        int size = 4;
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                if(a[i][j]!=b[i][j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        int b[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};

        if(identical(a,b))
        {
            System.out.println("Matrices are Identical.");
        }
        else
        {
            System.out.println("Matrices are not Identical.");
        }
    }
}
