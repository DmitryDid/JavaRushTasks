package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        String s = "";
        int count = 0;

        while (fileReader.ready()) {
            s += (char) fileReader.read();
        }

        String[] word = s.split("\\W");
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("world")) count++;
        }

        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}