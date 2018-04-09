package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();//напишите тут ваш код
        String name2 = scanner.nextLine();//напишите тут ваш код
        String name3 = scanner.nextLine();//напишите тут ваш код
        System.out.printf("%s + %s + %s = Чистая любовь, да-да!", name1, name2, name3);
    }
}