import java.util.HashSet;
import java.util.Set;

/*
Given an array of pairs of integers, find all symmetric pairs, i.e., pairs that mirror each other.
For instance, pairs (x, y) and (y, x) are mirrors of each other.

For example,

Input:  {3, 4}, {1, 2}, {5, 2}, {7, 10}, {4, 3}, {2, 5}

Output:

{4, 3} | {3, 4}
{2, 5} | {5, 2}
 */
class Pair
{
    public int x, y;

    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class SymmetricPair
{
    // Function to find all pairs that are a mirror of each other
    public static void findPairs(Pair[] pairs)
    {
        // create an empty set of strings
        Set<String> set = new HashSet<>();

        // do for each pair
        for (Pair curr_pair: pairs)
        {
            // construct a pair `(x, y)` from `curr_pair`
            String p = "{" + curr_pair.x + ", " + curr_pair.y + "}";

            // insert the current pair into the set
            set.add(p);

            // construct mirror pair `(y, x)` of `curr_pair`
            String rev_pair = "{" + curr_pair.y + ", " + curr_pair.x + "}";

            // if the mirror pair is seen before, print the pairs
            if (set.contains(rev_pair)) {
                System.out.println(p + " | " + rev_pair);
            }
        }
    }

    public static void main(String[] args)
    {
        Pair[] pairs =
                {
                        new Pair(3, 4), new Pair(1, 2), new Pair(5, 2),
                        new Pair(7, 10), new Pair(4, 3), new Pair(2, 5)
                };

        findPairs(pairs);
    }
}

