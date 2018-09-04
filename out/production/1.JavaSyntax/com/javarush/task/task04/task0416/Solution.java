package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double input = Double.parseDouble(reader.readLine());
        reader.close();

        double number = input%5;
        if (number<3){
            System.out.println("зелёный");
        }else if (number<4){
            System.out.println("жёлтый");
        }else
            System.out.println("красный");
    }
}