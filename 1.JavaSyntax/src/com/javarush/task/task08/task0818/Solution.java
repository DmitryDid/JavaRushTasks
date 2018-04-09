package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("F1", 100);
        map.put("F2", 200);
        map.put("F3", 300);
        map.put("F4", 400);
        map.put("F5", 500);
        map.put("F6", 600);
        map.put("F7", 700);
        map.put("F8", 800);
        map.put("F9", 900);
        map.put("F10", 1000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue()<500)
                map.remove(pair.getKey());
        }//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}