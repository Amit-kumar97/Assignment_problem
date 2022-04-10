import java.util.Scanner;

public class QueenMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bishop Moves in n*n Chess Board.");
        System.out.println("Enter the Size of Chess Board:");
        int size = sc.nextInt();
        System.out.println("Enter the Number of Rows And Columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Total number of Possible Moves:");
        System.out.println(queencount(row,col,size));

    }
    public static int queencount(int row, int col,int size)
    {
        if (row<=size && col<=size)
        {
            return (Math.min(row-1,col-1)+Math.min(row-1,size-col)+Math.min(size-row,col-1)+Math.min(size-row,size-col)+(size-1)+(size-1));
        }
        else
        {
            return 0;
        }
    }
}

