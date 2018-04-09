package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        int odd = 0;//нечетные
        int even = 0;//четные
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(reader.readLine());
            array[i] = number;
            if (i%2==0){
                even += number;
            }else {
                odd += number;
            }
        }

        if (even>odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        reader.close();
    }
}
