import java.util.*;

/*
Ques: A Pythagorean triplet is a set of three integers a, b and c such that a2 + b2 = c2. Given a limit, generate all Pythagorean 
Triples with values smaller than given limit.

Input : limit = 20
Output : 3 4 5
         8 6 10
         5 12 13
         15 8 17
         12 16 20
A Simple Solution is to generate these triplets smaller than given limit using three nested loop. For every triplet, check if 
Pythagorean condition is true, if true, then print the triplet. Time complexity of this solution is O(limit3) where ‘limit’ is given limit.

An Efficient Solution can print all triplets in O(k) time where k is number of triplets printed. The idea is to use square sum relation of 
Pythagorean triplet, i.e., addition of squares of a and b is equal to square of c, we can write these number in terms of m and n such that,

       a = m2 - n2
       b = 2 * m * n
       c  = m2 + n2
because,
       a2 = m4 + n4 – 2 * m2 * n2
       b2 = 4 * m2 * n2
       c2 = m4 + n4 + 2* m2 * n2
We can see that a2 + b2 = c2, so instead of iterating for a, b and c we can iterate for m and n and can generate these triplets
*/

class Wipro_Q6 
{
    public static void pythagoreanTriplets(int limit)
    {
        int a,b,c=0;
        int m=2;
        while(c<limit)
        {
            for(int n=1;n<m;++n)
            {
                a=m*m-n*n;
                b=2*m*n;
                c=m*m+n*n;
                if(c>limit)
                    break;
                System.out.println(a+" "+b+" "+c);
            }
            m++;
        }
    }
    public static void main(String[] args)
    {
        int limit=20;
        pythagoreanTriplets(limit);
    }
}
