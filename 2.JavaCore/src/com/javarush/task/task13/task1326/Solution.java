package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(new Scanner(System.in).nextLine()))));
        ArrayList<Integer> list = new ArrayList<>();

        while (fileReader.ready()) {
            list.add(Integer.parseInt(fileReader.readLine()));
        }

        Collections.sort(list);

        for (Integer i : list)
            if (i % 2 == 0) System.out.println(i);

        fileReader.close();
    }
}
