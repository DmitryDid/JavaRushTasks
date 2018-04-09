package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Math.max(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        int number2 = Math.max(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        reader.close();
        System.out.println(Math.max(number1,number2));
    }
}
