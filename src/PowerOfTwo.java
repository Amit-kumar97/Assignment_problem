import java.util.Scanner;


//-------check if an integer number is a power of 2

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        checkpower(ar);

    }
    public static void checkpower(int[] ar)
    {
        for (int num:ar) {
            int temp;
            boolean flag = true;
            while (num>1)
            {
                temp = num%2;
                if(temp%2!=0)
                {
                    flag = false;
                    break;
                }
                num = num/2;
            }
            if(flag==true)
            {
                System.out.println(flag);
            }
            else
            {
                System.out.println(flag);
            }
        }
    }
}
