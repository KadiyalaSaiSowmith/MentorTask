/*
7. First unique number

        Task:
        Implement a method that receives a string and looks for a unique character with the least index in this input string.
        Method should return the character itself.
*/

import java.util.*;
public class task7 {
    public void firstUniqueChar(String str1)
    {
        String string=str1;
        ArrayList<Character> charArrList =new ArrayList<Character>();
        // if u don't want spaces user str.replace keyword to remove the spaces
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        char charArray[] = string.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            if(hashMap.containsKey(charArray[i]))
            {
                hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
            }
            else
            {
                hashMap.put(charArray[i],1);
            }

        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int x = (int)entry.getValue();
            if(x==1)
            {   char ch1 = (char)entry.getKey();
                charArrList.add(ch1);
            }

        }
        System.out.println(charArrList);
        System.out.println(Arrays.toString(charArray));
        for(int i=0;i<charArray.length;i++)
        {
            if(charArrList.contains(charArray[i]))
            {
                System.out.println(charArray[i]);
                break;
            }
        }
    }
}
