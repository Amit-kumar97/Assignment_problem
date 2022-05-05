import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*
Given two strings, determine whether they are isomorphic. Two strings, X and Y, are called isomorphic
if all occurrences of each character in X can be replaced with another character to get Y and vice-versa.

For example,
consider strings ACAB and XCXY.
They are isomorphic as we can map 'A' —> 'X', 'B' —> 'Y' and 'C' —> 'C'.

Mapping from a character to itself is allowed, but the same character may not replace two characters.
 */

public class Isomorphic_String {

    // Find if strings 'X' and 'Y' are Isomorphic or not
    public static boolean isIsomorphic(String X, String Y)
    {
        // base case
        if (X == null || Y == null) {
            return false;
        }

        // if 'X' and 'Y' have different lengths, they cannot be isomorphic
        if (X.length() != Y.length()) {
            return false;
        }

        // use a map to store a mapping from characters of string 'X' to string 'Y'
        Map<Character, Character> map = new HashMap<>();

        // use set to store a pool of already mapped characters
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < X.length(); i++)
        {
            char x = X.charAt(i), y = Y.charAt(i);

            // if 'x' is seen before
            if (map.containsKey(x))
            {
                // return false if the first occurrence of `x` is mapped to a
                // different character
                if (map.get(x) != y) {
                    return false;
                }
            }

            // if 'x' is seen for the first time (i.e., it isn't mapped yet)
            else {
                // return false if 'y' is already mapped to some other char in 'X'
                if (set.contains(y)) {
                    return false;
                }

                // map 'y' to 'x' and mark it as mapped
                map.put(x, y);
                set.add(y);
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        String X = "ACAB";
        String Y = "XCXY";

        if (isIsomorphic(X, Y)) {
            System.out.println(X + " and " + Y + " are Isomorphic");
        }
        else {
            System.out.println(X + " and " + Y + " are not Isomorphic");
        }
    }
}
