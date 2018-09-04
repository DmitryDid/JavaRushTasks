package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = new Scanner(System.in).nextLine();

        if (args.length > 0) {
            if (args[0].startsWith("-c")) {
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
                ArrayList<Product> products = new ArrayList<>();
                int maxId = 0;

                while (fileReader.ready()) {
                    String s = fileReader.readLine();
                    products.add(new Product(s.substring(0, 8), s.substring(8, 38), s.substring(38, 46), s.substring(46, s.length())));
                }

                for (Product p : products) {
                    maxId = Math.max(maxId, p.getId());
                }
                fileReader.close();
                fileWriter.write(new Product(++maxId + "", args[1], args[2], args[3]).toString());
                fileWriter.close();
            }
        }
    }
}
