package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mineList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mineList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mineList.size(); i++) {
            int x = mineList.get(i);
            if ((x % 3 == 0) || (x % 2 == 0)) {
                if (x % 3 == 0) {
                    list3.add(x);
                }
                if (x % 2 == 0) {
                    list2.add(x);
                }
            } else
                otherList.add(x);//напишите тут ваш код
        }

        printList(list3);
        printList(list2);
        printList(otherList);
    }
    public static void printList (List <Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }//напишите тут ваш код
    }
}
