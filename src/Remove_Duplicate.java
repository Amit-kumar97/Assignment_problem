import java.util.Scanner;
import java.util.Stack;

/*
You are given a String s consisting of lowercase English letters. A duplicate removal consists of choosing two
adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.

Example 1:
 Input: s = "abbaca"
 Output: "ca"
 Explanation:
 for example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
 The result of this move is that the string is "aaca" , of which only "aa" is possible, so the final string is "ca".

 Example 2:
  Input: s = "azxxzy"
  Output: "ay"

  Try to solve this problem using Stack.
 */

public class Remove_Duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(remove(s));
    }
    public static String remove(String s)
    {
        if(s.length()==1)
            return s;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(stack.isEmpty())
                stack.push(s.charAt(i));

            else if (stack.peek()==s.charAt(i))
                stack.pop();

            else
                stack.push(s.charAt(i));
        }

        StringBuffer str = new StringBuffer("");
        while(!stack.isEmpty())
        {
            str.append(stack.pop());
        }

        str.reverse();
        return String.valueOf(str);
    }
}
