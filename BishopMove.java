import java.util.Scanner;


//====================Bishop Move Problem==================//


public class BishopMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bishop Moves in 8*8 Chess Board.");
        System.out.println("Enter the Number of Rows And Columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Total number of Possible Moves:");
        System.out.println(bishopcount(row,col));

    }
    public static int bishopcount(int row, int col)
    {
        if (row<=8 && col<=8)
        {
            return (Math.min(row-1,col-1)+Math.min(row-1,8-col)+Math.min(8-row,col-1)+Math.min(8-row,8-col));
        }
        else
        {
            return 0;
        }
    }
}
