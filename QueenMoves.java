import java.util.Scanner;

public class QueenMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bishop Moves in 8*8 Chess Board.");
        System.out.println("Enter the Number of Rows And Columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Total number of Possible Moves:");
        System.out.println(queencount(row,col));

    }
    public static int queencount(int row, int col)
    {
        if (row<=8 && col<=8)
        {
            return (Math.min(row-1,col-1)+Math.min(row-1,8-col)+Math.min(8-row,col-1)+Math.min(8-row,8-col)+(8-1)+(8-1));
        }
        else
        {
            return 0;
        }
    }
}
