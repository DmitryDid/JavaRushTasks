package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("F1","N1");//
        map.put("F2","N1");//
        map.put("F3","N2");
        map.put("F4","N3");
        map.put("F5","N4");
        map.put("F6","N5");
        map.put("F7","N6");
        map.put("F8","N7");
        map.put("F9","N1");//
        map.put("F10","N8");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            int count = 0;
            String curentName = pair.getValue();
            for (Map.Entry<String, String> pairIn:copy.entrySet()) {
                if (curentName.equals(pairIn.getValue())){
                    count++;
                    if (count>1){
                        removeItemFromMapByValue(map, curentName);
                        count = 0;
                    }
                }
            }
        }
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair.getValue());
//        }
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//    removeTheFirstNameDuplicates(createMap());
    }
}
