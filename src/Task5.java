/*
5. Count letters

        Task:

        Implement a method that receives a string and returns a map with letters from this string and
        a number of how many times this letter occur in the string. Print the test result.
*/
import java.util.*;
public class Task5 {
    public static void countLetters(String str)
    {
        String string = str;
        // if u don't want spaces user str.replace keyword to remove the spaces
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        char charArr[] = string.toCharArray();
        for(int i=0;i<charArr.length;i++)
        {
            if(hashMap.containsKey(charArr[i]))
            {
                hashMap.put(charArr[i], hashMap.get(charArr[i]) + 1);
            }
            else
            {
                hashMap.put(charArr[i],1);
            }

        }
        System.out.println(hashMap);
    }
}
