package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < list.length; i++) {
            int curent = list[i];
            if (curent>maximum)
                maximum = curent;
            if (curent<minimum)
                minimum = curent;
        }
        reader.close();
        System.out.print(maximum + " " + minimum);
    }
}
