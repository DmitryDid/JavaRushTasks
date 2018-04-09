package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array20 = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array20.length; i++) {
            array20[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array20.length; i++) {
            if (i<10) {
                array1[i] = array20[i];
            }else {
                array2[i-10] = array20[i];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        reader.close();
    }
}
