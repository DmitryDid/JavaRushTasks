package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        reader.close();

        if (number==0){
            System.out.println("ноль");
        }else if (number>0){
            if (number%2==0){
                System.out.println("положительное четное число");
            }else {
                System.out.println("положительное нечетное число");
            }
        }else {
            if (number%2==0){
                System.out.println("отрицательное четное число");
            }else {
                System.out.println("отрицательное нечетное число");
            }
        }//напишите тут ваш код
    }
}
