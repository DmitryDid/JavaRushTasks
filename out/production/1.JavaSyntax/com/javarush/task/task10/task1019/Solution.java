package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        try {
            while (true) {
                Integer integer = Integer.parseInt(reader.readLine());
                String str = reader.readLine();
                map.put(str, integer);
            }
        } catch (NumberFormatException e) {
            map.forEach((key, volue) -> {
                System.out.println(volue + " " + key);
            });
        }
    }
}
