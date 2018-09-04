package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }//напишите тут ваш код
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> list = new HashSet<>();
        for (Integer i:set) {
            if (i<=10){
                list.add(i);
            }
        }
        set = null;
        return list;
    }

    public static void main(String[] args) {

    }
}
