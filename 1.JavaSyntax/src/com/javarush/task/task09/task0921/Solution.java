package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                integers.add(Integer.parseInt(reader.readLine()));//напишите тут ваш код
            } catch (Exception e) {
                for (int i = 0; i < integers.size(); i++) {
                    System.out.println(integers.get(i));
                }
                break;
            }
        }
    }
}
