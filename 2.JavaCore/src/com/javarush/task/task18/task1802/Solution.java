package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(scanner.nextLine());
        int min = Integer.MAX_VALUE;

        while (fis.available() > 0) {
            int curr = fis.read();
            if (curr < min) min = curr;
        }
        System.out.println(min);
        scanner.close();
        fis.close();
    }
}
