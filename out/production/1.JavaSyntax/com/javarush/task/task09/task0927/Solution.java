package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("cat1", new Cat("Cat1"));//напишите тут ваш код
        map.put("cat2", new Cat("Cat2"));//напишите тут ваш код
        map.put("cat3", new Cat("Cat3"));//напишите тут ваш код
        map.put("cat4", new Cat("Cat4"));//напишите тут ваш код
        map.put("cat5", new Cat("Cat5"));//напишите тут ваш код
        map.put("cat6", new Cat("Cat6"));//напишите тут ваш код
        map.put("cat7", new Cat("Cat7"));//напишите тут ваш код
        map.put("cat8", new Cat("Cat8"));//напишите тут ваш код
        map.put("cat9", new Cat("Cat9"));//напишите тут ваш код
        map.put("cat10", new Cat("Cat10"));//напишите тут ваш код
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
