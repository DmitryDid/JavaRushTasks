package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("F1", "N1");//напишите тут ваш код
        map.put("F2", "N1");//напишите тут ваш код
        map.put("F9", "N3");//напишите тут ваш код
        map.put("F9", "N4");//напишите тут ваш код
        map.put("F5", "N5");//напишите тут ваш код
        map.put("F6", "N6");//напишите тут ваш код
        map.put("F7", "N7");//напишите тут ваш код
        map.put("F8", "N8");//напишите тут ваш код
        map.put("F9", "N9");//напишите тут ваш код
        map.put("F9", "N10");//напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
