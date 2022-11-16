/*6. Even numbers iterator
        Task:
        Implement iterator over the integer array that only iterates over the even numbers and
         ignores uneven.
        Print the test result.*/
import java.util.*;
public class Task6 {
    public static void evenNumbersIterator()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.println("Enter the elements into the array");
        for(int i=0;i<10;i++)
        {
            int dummy =sc.nextInt();
            arrList.add(dummy);
        }
        Iterator<Integer> iterator = arrList.iterator();
        System.out.println();
        System.out.println("The required output array which iterates only over the Even Numbers USING ITERATOR");

        while(iterator.hasNext())
        {
            int check=iterator.next();
            if(check%2!=0)
            {
                iterator.remove();
            }
        }
        System.out.println(arrList);
    }

}
