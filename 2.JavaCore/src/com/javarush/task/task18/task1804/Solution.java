package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new Scanner(System.in).nextLine());
        Map<Integer, Integer> map = new HashMap<>();

        while (fis.available() > 0) {
            int curr = fis.read();
            if (!map.containsKey(curr)) map.put(curr, 1);
            else {
                int count = map.get(curr);
                map.put(curr, ++count);
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 1)
                System.out.print(pair.getKey() + " ");
        }
        fis.close();
    }
}