package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minSize = Integer.MAX_VALUE;
        int maxSize = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            arrayList.add(s);

            if (s.length() > maxSize)
                maxSize = s.length();
            if (s.length() < minSize)
                minSize = s.length();
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int stringSize = arrayList.get(i).length();
            if ((stringSize==maxSize)||(stringSize==minSize)){
                System.out.println(arrayList.get(i));
                break;
            }
        }
        //напишите тут ваш код
    }
}
