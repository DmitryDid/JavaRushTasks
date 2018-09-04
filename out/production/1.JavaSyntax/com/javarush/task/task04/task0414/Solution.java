package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        ArrayList<Integer> earsVList = new ArrayList<>();
        for (int i = 0; i < year + 1; i++) {
            if (i%4==0)
                earsVList.add(i);
        }
        for (int i = 0; i < earsVList.size(); i++) {
            if ((earsVList.get(i)%100==0)&&!(earsVList.get(i)%400==0))
                earsVList.remove(i);
        }
            if (earsVList.contains(year)){
                System.out.println("количество дней в году: 366");
            }else
                System.out.println("количество дней в году: 365");


    }
}
