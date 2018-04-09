package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int avg = 0;

        if (((a<=b)&&(b<=c))||((c<=b)&&(b<=a))){
            avg = b;
        }else if (((b<=a)&&(a<=c))||((c<=a)&&(a<=b))){
            avg = a;
        }else avg = c;

        System.out.println(avg);
    }
}
