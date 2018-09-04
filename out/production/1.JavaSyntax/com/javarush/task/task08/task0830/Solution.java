package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        Thread.sleep(-1000);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        for (int i = 0; i < array.length-1; i++) {
            if (isGreaterThan(array[i],array[i+1])){
                String s = array[i];
                array[i] = array[i+1];
                array[i+1] = s;
                i=0;
            }
        }

//        for (int i = 1; i < array.length; i++) {
//            if (isGreaterThan(array[i-1], array[i])){
//                String temp = array[i-1];
//                array[i-1] = array[i];
//                array[i] = temp;
//                i = 1;
//            }
//
//        }
//        for (int i = 1; i < array.length; i++) {
//            if (isGreaterThan(array[i-1], array[i])){
//                String temp = array[i-1];
//                array[i-1] = array[i];
//                array[i] = temp;
//                i = 1;
//            }
//
//        }//напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
