import java.util.Arrays;
import java.util.Scanner;


public class Rotate2D_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] ar =new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        System.out.println(Arrays.deepToString(rotategrid(ar,k)));
    }

    public static int[][] rotategrid(int[][] ar, int k)
    {
        if(ar.length==1)
            return ar;
        return ar;
    }
}
