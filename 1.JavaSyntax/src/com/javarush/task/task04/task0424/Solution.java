package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if ((a==b)&&(a!=c)){
            System.out.println(3);
        }else if ((a==c)&&(a!=b)){
            System.out.println(2);
        }else if ((c==b)&&(c!=a)){
            System.out.println(1);
        }

        //напишите тут ваш код
    }
}
