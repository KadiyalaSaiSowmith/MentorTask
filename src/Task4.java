/*4. Removal of the number

        Task:

        Implement a method that receives an integer number and an array of integers.
        Method should remove every element of an array that contains the number from the first argument.
        There should be no gaps in the result array.
        Print the test result.*/
import java.util.*;

public class Task4 {
    public static void main(String args[])
    {  int remove;
        int sub=0;
        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integer elements in an array");
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be removed from the array");
        remove=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==remove)
            {
                sub++;
            }
        }
        int [] resultArr = new int[arr.length-sub];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==remove)
            {

            }
            else {
                resultArr[k]=arr[i];
                k++;
            }
        }
        System.out.println("Original input Array: " + Arrays.toString(arr));
        System.out.println("Modified Output Array: " + Arrays.toString(resultArr));



    }
}
