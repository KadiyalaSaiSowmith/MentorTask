import java.util.Random;
import java.util.*;

public class Task_1and2 {
    public static void main(String args[])
    {
        double max=0,min=0,avg=0,ans=0;
        double[] arr = new double[10];
        double d =0;
      //  Random randNum = new Random();
        for (int i = 0; i < arr.length; i++) {
             d = Math.random();
            arr[i] =d;
        }
        min = arr[0];
        //check
        /*for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }*/
        // finding the max value,min value and avg
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
            if(arr[i]<=min)
            {
                min=arr[i];
            }
            avg+=arr[i];

        }
        ans = (avg/arr.length);
        System.out.println("min value is "+min);
        System.out.println("max value is "+max);
        System.out.println("avg value is "+ans);

        //Task2 Starts Here
        //Sorting the array using bubble sort
        double temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
