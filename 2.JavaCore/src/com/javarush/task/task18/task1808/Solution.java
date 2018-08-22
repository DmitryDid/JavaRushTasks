package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(scanner.nextLine());
        FileOutputStream fos1 = new FileOutputStream(scanner.nextLine());
        FileOutputStream fos2 = new FileOutputStream(scanner.nextLine());

        if (fis.available() > 0) {
            byte[] buffer = new byte[fis.available()];
            int count = fis.read(buffer);
            fos1.write(buffer, 0, count/2);
            fos2.write(buffer, count - (count/2), count/2);
        }

//        byte[] buffer1 = new byte[fis.available() - (fis.available() / 2)];
//        byte[] buffer2 = new byte[fis.available() / 2];
//        int count1 = fis.read(buffer1);
//        int count2 = fis.read(buffer2);
//        fos1.write(buffer1, 0, count1);
//        fos2.write(buffer2, 0, count2);

        scanner.close();
        fis.close();
        fos1.close();
        fos2.close();
    }
}
