package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double summ = 0;
        int count = 0;

        while (true){
            int number = Integer.parseInt(reader.readLine());
            if (number == -1){
                System.out.println(summ/count);
                break;
            }
            summ = summ + number;
            count++;
        }
        reader.close();//напишите тут ваш код
    }
}

