package com.javarush.task.task08.task0816;

import javax.sound.midi.Soundbank;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("MAY 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));

        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if ((pair.getValue().getMonth()>4)&&(pair.getValue().getMonth()<8)){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
//        removeAllSummerPeople(createMap());
    }
}
