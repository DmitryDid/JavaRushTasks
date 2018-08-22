package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        int count = 0;

        while (reader.available() > 0) {
            int chars = reader.read();
            if ((chars >= 65 && chars <= 90) || (chars >= 97 && chars <= 122)) count++;
        }
        System.out.println(count);
        reader.close();
    }
}
