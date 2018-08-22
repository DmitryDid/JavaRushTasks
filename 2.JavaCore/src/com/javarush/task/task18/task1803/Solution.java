package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(scanner.nextLine());
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        while (fis.available() > 0) {
            int curr = fis.read();
            if (!map.containsKey(curr)) map.put(curr, 1);
            else {
                int count = map.get(curr);
                map.put(curr, ++count);
                if (count > max) max = count;
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == max)
                System.out.print(pair.getKey() + " ");
        }
        scanner.close();
        fis.close();
    }
}
