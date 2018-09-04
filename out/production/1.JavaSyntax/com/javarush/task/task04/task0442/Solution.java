package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;

        while (true){
            int temp = Integer.parseInt(reader.readLine());
            summ = summ + temp;
            if (temp == -1){
                break;
            }

        }

        System.out.println(summ);//напишите тут ваш код
    }
}
