package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
//        map.p
        map.put("арбуз", "ягода");//напишите тут ваш код
        map.put("банан", "трава");//напишите тут ваш код
        map.put("вишня", "ягода");//напишите тут ваш код
        map.put("груша", "фрукт");//напишите тут ваш код
        map.put("дыня", "овощ");//напишите тут ваш код
        map.put("ежевика", "куст");//напишите тут ваш код
        map.put("жень-шень", "корень");//напишите тут ваш код
        map.put("земляника", "ягода");//напишите тут ваш код
        map.put("ирис", "цветок");//напишите тут ваш код
        map.put("картофель", "клубень");//напишите тут ваш код

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> pair = iterator.next();
//            System.out.println(pair.getKey() + " - " + pair.getValue());
    }
}
