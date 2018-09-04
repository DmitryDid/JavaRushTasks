package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minStringSize = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            int size = s.length();
            strings.add(s);
            if (size<minStringSize)
                minStringSize = size;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minStringSize)
                System.out.println(strings.get(i));
        }
        reader.close();
        //напишите тут ваш код
    }
}
