import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int num = sc.nextInt();
            System.out.println(num*num);
            System.out.println("The work has been done successfully.");
        }
        catch (Exception obj)
        {
            System.out.println("Entered input is not valid format for an integer.");
        }
    }
}
