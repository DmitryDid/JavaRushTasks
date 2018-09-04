package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            array[i] = scanner.next();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }//напишите тут ваш код
    }
}