package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = null;

        while (true){
            fis = new FileInputStream(scanner.nextLine());
            if (fis.available() < 1000) {
                scanner.close();
                fis.close();
                throw new DownloadException();
            }
        }
    }


    public static class DownloadException extends Exception {

    }
}
