package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<FileReader> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String fileName = scanner.nextLine();
            try {
                FileReader fileReader = new FileReader(fileName);
                list.add(fileReader);
            } catch (FileNotFoundException e) {
                System.out.printf(fileName);
                scanner.close();
                for (FileReader reader : list) {
                    reader.close();
                }
                return;
            }
        }
    }
}
