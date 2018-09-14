package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
//        BufferedReader fileReader = new BufferedReader(new FileReader("dataIn.txt"));
//        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("dataOut.txt"));
        reader.close();

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            fileWriter.write(s.replaceAll("\\p{Punct}", ""));
        }
        fileReader.close();
        fileWriter.close();
    }
}
