package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new Scanner(System.in).nextLine());
        FileOutputStream fos = new FileOutputStream(new Scanner(System.in).nextLine());
        byte[] bytes = new byte[fis.available()];

        fis.read(bytes);


        for (int i = 0; i < bytes.length; i++) {
            fos.write(bytes[bytes.length - 1 - i]);
        }

        fis.close();
        fos.close();
    }
}
