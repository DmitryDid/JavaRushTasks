package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int first = i;
            for (int j = 0; j < 10; j++) {
                System.out.print(first + " ");
                first = first +i;
            }
            System.out.println();
        }//напишите тут ваш код
    }
}
