package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream(scanner.nextLine(), true);
        FileInputStream fis1 = new FileInputStream(scanner.nextLine());
        FileInputStream fis2 = new FileInputStream(scanner.nextLine());

        if (fis1.available() > 0) {
            byte[] buffer = new byte[fis1.available()];
            fis1.read(buffer);
            fos.write(buffer);
            fos.flush();
        }

        if (fis2.available() > 0) {
            byte[] buffer = new byte[fis2.available()];
            fis2.read(buffer);
            fos.write(buffer);

        }
        scanner.close();
        fos.close();
        fis1.close();
        fis2.close();
    }
}
