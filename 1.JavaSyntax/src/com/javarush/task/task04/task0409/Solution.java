package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int temp1 = 10 - a;//напишите тут ваш код
        int temp2 = 10 - b;
        if (abs(temp1) < abs(temp2)){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


        //напишите тут ваш код

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}