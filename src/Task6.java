/*6. Even numbers iterator
        Task:
        Implement iterator over the integer array that only iterates over the even numbers and
         ignores uneven.
        Print the test result.*/
import java.util.*;
public class Task6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements into the array");
        for(int i=0;i<10;i++)
        {
            int x =sc.nextInt();
            arr.add(x);
        }
        // Conversion of array to ArrayList
        // using Arrays.asList
       // List all = Arrays.asList(arr);
        Iterator<Integer> it = arr.iterator();
        System.out.println();
        System.out.println("The required output array which iterates only over the Even Numbers USING ITERATOR");

       while(it.hasNext())
       {
           int c=it.next();
           if(c%2!=0)
           {
               it.remove();
           }
       }
       System.out.println(arr);
    }

}
