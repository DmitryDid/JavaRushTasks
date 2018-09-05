package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        bufferedReader.close();

        while (fileReader.ready()) {
            fileReader.read();
            fileWriter.write(fileReader.read());
        }
        fileReader.close();
        fileWriter.close();
    }
}

