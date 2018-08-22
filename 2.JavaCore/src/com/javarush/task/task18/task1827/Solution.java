package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int k = 0; k < 10; k++) {
            int i = scanner.nextInt();
            if (!map.containsKey(i)) map.put(i, 1);
            else {
                int count = map.get(i) + 1;
                map.put(i, count);
                if (count > max) max = count;
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == max) {
                System.out.println("max number: " + pair.getKey());
                System.out.println("max count: " + pair.getValue());
            }
        }
        scanner.close();
    }
}
