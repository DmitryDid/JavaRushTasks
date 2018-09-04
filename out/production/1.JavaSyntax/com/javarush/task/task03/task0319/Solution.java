package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int valueMoney = scanner.nextInt();//напишите тут ваш код
        int valueAge = scanner.nextInt();//напишите тут ваш код

        System.out.printf("%s получает %d через %d лет.", name, valueMoney, valueAge);
    }
}
