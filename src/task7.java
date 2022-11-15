/*
7. First unique number

        Task:
        Implement a method that receives a string and looks for a unique character with least index in this input string.
        Method should return the character itself.
*/

import java.util.*;
public class task7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        ArrayList<Character> ans =new ArrayList<Character>();
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
        for (Map.Entry entry : hashy.entrySet()) {
            int x = (int)entry.getValue();
            if(x==1)
            {   char ch1 = (char)entry.getKey();
                ans.add(ch1);
            }

        }
        System.out.println(ans);
        System.out.println(Arrays.toString(ch));
        for(int i=0;i<ch.length;i++)
        {
            if(ans.contains(ch[i]))
            {
                System.out.println(ch[i]);
                break;
            }
        }
    }
}
