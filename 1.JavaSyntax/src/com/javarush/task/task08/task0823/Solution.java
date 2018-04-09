package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>0) {
                String firstChar = String.valueOf(words[i].charAt(0));
                String firstUpperChar = firstChar.toUpperCase();
                words[i] = words[i].replaceFirst(firstChar, firstUpperChar).toString();
                System.out.println(words[i]);
            }
        }
    }
}
