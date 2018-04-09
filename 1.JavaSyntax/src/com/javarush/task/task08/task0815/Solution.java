package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("F1", "N1");//напишите тут ваш код
        map.put("F2", "N1");
        map.put("F3", "N1");
        map.put("F4", "N1");
        map.put("F5", "N2");
        map.put("F6", "N2");
        map.put("F7", "N3");
        map.put("F8", "N3");
        map.put("F9", "N3");
        map.put("F10", "N3");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getValue().equals(name))
                count++;
        }//напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getKey().equals(lastName))
                count++;
        }//напишите тут ваш код
        return count;
    }

    public static void main(String[] args) {
    }
}
