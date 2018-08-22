package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
//        FileInputStream fis = new FileInputStream("dataIn.txt");
        Map<Character, Integer> map = new TreeMap<>();

        while (fis.available() > 0) {
            char c = (char) fis.read();
            if (map.containsKey(c)) map.put(c, map.get(c));
            else map.put(c, 1);
        }

        fis.close();

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            String s = pair.getKey() + " " + pair.getValue();
            System.out.println(s);
        }
    }
}
