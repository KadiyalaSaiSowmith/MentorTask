/*Implement a logic that looks for all prime numbers on the specified interval.
use interval [2, 100] to test it (2 and 100 are included into the interval).
Print the test result.*/

import java.util.*;
public class Task3 {

    public void primeNumbers(int start_int,int end_int)
    {
        int count=0;
        ArrayList<Integer> primeNo = new ArrayList<Integer>();
        int starting_number = start_int;
        int ending_number = end_int;
        for(int i=2;i<=100;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                primeNo.add(i);

            }
            count=0;
        }
        System.out.println("The Prime Numbers in the range 2 to 100 are shown below");
        System.out.println(primeNo);
    }
}
