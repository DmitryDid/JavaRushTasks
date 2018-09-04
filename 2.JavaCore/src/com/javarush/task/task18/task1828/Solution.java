package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            String fileName = new Scanner(System.in).nextLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            ArrayList<Product> products = new ArrayList<>();
            int paramId = Integer.parseInt(args[1].trim());

            while (fileReader.ready()) {
                String s = fileReader.readLine();
                products.add(new Product(s.substring(0, 8), s.substring(8, 38), s.substring(38, 46), s.substring(46, s.length())));
            }
            fileReader.close();

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
            if (args[0].startsWith("-d")) {
                for (Product p : products) {
                    if (p.getId() == paramId) continue;
                    fileWriter.write(p.toString());
                }
            }
            if (args[0].startsWith("-u")) {
                for (Product p : products) {
                    if (p.getId() == paramId) {
                        p.setProductName(args[2].trim());
                        p.setPrice(args[3].trim());
                        p.setQuantity(args[4]);
                    }
                    fileWriter.write(p.toString());
                }
            }
            fileWriter.close();
        }
    }
}
