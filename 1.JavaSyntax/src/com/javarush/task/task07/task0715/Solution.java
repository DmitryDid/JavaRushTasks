package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");//напишите тут ваш код
        arrayList.add("мыла");//напишите тут ваш код
        arrayList.add("раму");//напишите тут ваш код

        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).equals("именно"))
                arrayList.add(i+1, "именно");
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
