package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int maxStringSize = 0;

        for (int i = 0; i < 5; i++) {
            String temp = reader.readLine();
            int size = temp.length();
            strings.add(temp);
            if (size>maxStringSize)
                maxStringSize = size;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxStringSize)
                System.out.println(strings.get(i));
        }
        reader.close();
    }
}
