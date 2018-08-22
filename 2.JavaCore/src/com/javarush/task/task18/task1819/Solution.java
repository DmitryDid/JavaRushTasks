package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        scanner.close();
//        String fileName1 = "dataIn.txt";
//        String fileName2 = "dataOut.txt";

        FileInputStream fis1 = new FileInputStream(fileName1);
        byte[] buffer = new byte[fis1.available()];
        fis1.read(buffer);
        fis1.close();

        FileOutputStream fos = new FileOutputStream(fileName1);
        FileInputStream fis2 = new FileInputStream(fileName2);

        fos.write(new byte[0]);
        fos.flush();

        byte[] buffer2 = new byte[fis2.available()];
        fis2.read(buffer2);
        fos.write(buffer2);
        fos.write(buffer);
        fis2.close();
        fos.close();
    }
}
