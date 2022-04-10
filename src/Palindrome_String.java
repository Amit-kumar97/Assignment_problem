import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome_String {

    static boolean checkPalindrome(String str)
    {
        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++)
        {
            if (list.contains(str.charAt(i)))
                list.remove((Character)str.charAt(i));
            else
                list.add(str.charAt(i));
        }

        if (str.length() % 2 == 0 && list.isEmpty() || (str.length() % 2 == 1 && list.size() == 1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("Enter a String:");
        System.out.println(checkPalindrome(str));
    }
}
