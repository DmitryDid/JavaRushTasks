package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("один");
        arrayList.add("два");
        arrayList.add("три");
        arrayList.add("четыре");
        arrayList.add("пять");

        System.out.println(arrayList.size());

        for (String s:arrayList) {
            System.out.println(s);
        }
    }
}
