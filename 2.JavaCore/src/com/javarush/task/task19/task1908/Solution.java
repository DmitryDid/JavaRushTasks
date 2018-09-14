package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
//        BufferedReader fileReader = new BufferedReader(new FileReader("dataIn.txt"));
//        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("dataOut.txt"));
        reader.close();
//        long time = System.currentTimeMillis();
        while (fileReader.ready()) {
            String[] strings = fileReader.readLine().split(" ");
            for (String s : strings) {
                try {
                    fileWriter.write(Integer.parseInt(s) + " ");
                } catch (NumberFormatException e) {
                }
            }
        }
//        System.out.println(System.currentTimeMillis() - time);
        fileReader.close();
        fileWriter.close();
    }
}
