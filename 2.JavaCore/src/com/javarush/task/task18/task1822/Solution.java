package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new Scanner(System.in).nextLine()));
//        BufferedReader reader = new BufferedReader(new FileReader("dataIn.txt"));

        String id = "";
        String productName = "";
        double price = 0.0;
        int quantity = 0;

        while (reader.ready()) {
            String s = reader.readLine();
            if (s.startsWith(args[0])) {
                String[] array = s.split(" ");
                id = array[0];
                productName = array[1];
                price = Double.parseDouble(array[2]);
                quantity = Integer.parseInt(array[3]);
            }
        }
        System.out.print(id + " " + productName + " " + price + " " + quantity);
        reader.close();
    }
}

