package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int countPositiveNumber = 0;
        int countNegativeNumber = 0;

        for (int i = 0; i < 3; i++) {
            int temp = scanner.nextInt();
            if (temp>0){
                countPositiveNumber++;
            }else if(temp<0){
                countNegativeNumber++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countNegativeNumber);
        System.out.println("количество положительных чисел: " + countPositiveNumber);
        //напишите тут ваш код
        scanner.close();

    }
}
