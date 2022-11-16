/*4. Removal of the number

        Task:

        Implement a method that receives an integer number and an array of integers.
        Method should remove every element of an array that contains the number from the first argument.
        There should be no gaps in the result array.
        Print the test result.*/
import java.util.*;

public class Task4 {
    public static void removalOfTheNumber(int removeInt,int[] arr1)
    {
        int removeInteger=removeInt;
        int[] array1 = new int[arr1.length];
        array1 = arr1;
        int UnwantedIntegerCount=0;
        int ResultArrayIndex=0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]==removeInteger)
            {
                UnwantedIntegerCount++;
            }
        }
        int [] resultArr = new int[array1.length-UnwantedIntegerCount];
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]==removeInteger)
            {

            }
            else {
                resultArr[ResultArrayIndex]=array1[i];
                ResultArrayIndex++;
            }
        }
        System.out.println("Original input Array: " + Arrays.toString(array1));
        System.out.println("Modified Output Array: " + Arrays.toString(resultArr));



    }
}
