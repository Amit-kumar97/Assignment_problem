import java.util.Arrays;


/*
Problem: Find minimum platforms needed to avoid delay in the train arrival.
Given a schedule containing the arrival and departure time of trains in a station,
find the minimum number of platforms needed to avoid delay in any train’s arrival.

For example:
Trains arrival   = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 }
Trains departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 }

Output: The minimum platforms needed is 2

Explanation:
The train arrived at 2.00 on platform 1
The train arrived at 2.10 on platform 2
The train departed at 2.30 from platform 1
The train arrived at 3.00 on platform 1
The train departed at 3.20 from platform 1
The train arrived at 3.20 on platform 1
The train departed at 3.40 from platform 2
The train arrived at 3.50 on platform 2
The train departed at 4.00 from platform 2
The train departed at 4.30 from platform 1
The train arrived at 5.00 on platform 1
The train departed at 5.20 from platform 1

Practice this problem,

The idea is to merge the arrival and departure times of trains and consider them in sorted order.
Maintain a counter to count the total number of trains present at the station at any point.
The counter also represents the total number of platforms needed at that time.

     *  If the train is scheduled to arrive next, increase the counter by one and update the minimum
        platforms needed if the count is more than the minimum platforms needed so far.
     *  If the train is scheduled to depart next, decrease the counter by 1.

One special case needs to be handled – when two trains are scheduled to arrive and depart simultaneously,
depart the train first.
 */

public class Train_Arrays {
    public static int findMinPlatforms(double[] arrival, double[] departure)
    {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int count = 0;                             // maintains the count of trains
        int platform = 0;                          // stores minimum platforms needed
        int i = 0, j = 0;                // take two indices for arrival and departure time

        // run till all trains have arrived
        while(i < arrival.length) {

            // if a train is scheduled to arrive next
            if (arrival[i] < departure[j]) {

                // increase the count of trains and update minimum platforms if required
                platform = Integer.max(platform, count++);

                // move the pointer to the next arrival
                i++;
            }
            else {
                count--;
                j++;
            }
        }
        return platform;
    }
    public static void main(String[] args)
    {
        double[] arrival = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
        double[] departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 };

        System.out.println("The minimum Platforms needed is: "+findMinPlatforms(arrival, departure));
    }
}
