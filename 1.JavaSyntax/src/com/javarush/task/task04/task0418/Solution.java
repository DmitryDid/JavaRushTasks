package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.min(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine())));
        reader.close();//напишите тут ваш код
    }
}