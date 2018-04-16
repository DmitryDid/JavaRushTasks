package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        String s1 = "", s2 = "";
        char[] phrase = new Scanner(System.in).nextLine().replaceAll(" ", "").toCharArray();

        for (int i = 0; i < phrase.length; i++) {
            if (isVowel(phrase[i])) s1 = s1 + phrase[i] + " ";
            else s2 = s2 + phrase[i] + " ";
        }

        System.out.printf("%s\n%s", s1, s2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}