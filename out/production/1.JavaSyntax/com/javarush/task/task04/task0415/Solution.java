package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//напишите тут ваш код
        int b = scanner.nextInt();//напишите тут ваш код
        int c = scanner.nextInt();

        if (((a+b)>c)&&((a+c)>b)&&((c+b)>a)) {
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        } //напишите тут ваш код
    }
}