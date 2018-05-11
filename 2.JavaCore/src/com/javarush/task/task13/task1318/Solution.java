package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
//        FileOutputStream fos = new FileOutputStream("C:\\Cloud Mail.Ru\\IT\\Java\\2018\\project\\JavaRushTasks\\dataOut.txt");

        while (fis.available() > 0) {
            char c = (char) fis.read();
//            fos.write(c);
            System.out.print(c);
        }

        reader.close();
        fis.close();
//        fos.close();
    }
}