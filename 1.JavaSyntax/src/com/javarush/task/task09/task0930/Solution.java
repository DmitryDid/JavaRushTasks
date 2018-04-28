package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // разделил на два массива разных типов
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) numbers.add(Integer.valueOf(array[i]));
            else words.add(array[i]);
        }
        //сортировка массива слов
        for (int i = 1; i < words.size(); i++) {
            if (isGreaterThan(words.get(i - 1), words.get(i))) {
                String temp = words.get(i - 1);
                words.set(i - 1, words.get(i));
                words.set(i, temp);
                i = 0;
            }
        }

        Collections.sort(numbers);
        //сортировка массива чисел
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i]))
                array[i] = String.valueOf(numbers.remove(numbers.size()-1));
            else
                array[i] = words.remove(0);
        }//напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
