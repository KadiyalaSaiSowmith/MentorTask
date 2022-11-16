import java.util.Random;
import java.util.*;

public class Task_1and2 {
    public double[] MaxMinAvg() {
        double max = 0, min = 0, avg = 0, ans = 0;
        double[] array1 = new double[10];
        double dummy = 0;
        //  Random randNum = new Random();
        for (int i = 0; i < array1.length; i++) {
            dummy = Math.random();
            array1[i] = dummy;
        }
        min = array1[0];
        //check
        /*for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }*/
        // finding the max value,min value and avg
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= max) {
                max = array1[i];
            }
            if (array1[i] <= min) {
                min = array1[i];
            }
            avg += array1[i];

        }
        ans = (avg / array1.length);
        System.out.println("min value is " + min);
        System.out.println("max value is " + max);
        System.out.println("avg value is " + ans);

        return array1;
    }
    //Task2 Starts Here
    //Sorting the array using bubble sort
    public  void bubbleSort(double[] array2)

    {
        double temp;
        for (int i = 0; i < array2.length; i++)
        {
            for (int j = i + 1; j < array2.length; j++)
            {
                if (array2[i] > array2[j])
                {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is");
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]+" ");
        }
    }
}
