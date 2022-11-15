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
        int arr[] = new int[10];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("The required output array which iterates only over the Even Numbers");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
