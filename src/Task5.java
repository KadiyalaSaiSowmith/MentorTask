/*
5. Count letters

        Task:

        Implement a method that receives a string and returns a map with letters from this string and
        a number of how many times this letter occur in the string. Print the test result.
*/
import java.util.*;
public class Task5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        // if u don't want spaces user str.replace keyword to remove the spaces
        HashMap<Character,Integer> hashy = new HashMap<Character, Integer>();
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(hashy.containsKey(ch[i]))
            {
                hashy.put(ch[i], hashy.get(ch[i]) + 1);
            }
            else
            {
                hashy.put(ch[i],1);
            }

        }
        System.out.println(hashy);
    }
}
