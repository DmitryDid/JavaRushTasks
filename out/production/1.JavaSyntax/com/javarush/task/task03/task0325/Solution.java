package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(bufferedReader.readLine());
        System.out.printf("Я буду зарабатывать $%d в час", value);
        bufferedReader.close();//напишите тут ваш код
    }
}
