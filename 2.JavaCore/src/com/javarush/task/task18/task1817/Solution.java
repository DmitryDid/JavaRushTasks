package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int countAll = 0;
        int countSpace = 0;

        while (fis.available() > 0) {
            if (fis.read() == ' ') countSpace++;
            countAll++;
        }
        fis.close();
        double result =  countSpace / ((double)countAll) * 100;
        System.out.printf("%.2f", result);
    }
}
