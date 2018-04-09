package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;

        while (true){
            String str = scanner.nextLine();
            if (str.equals("сумма")){
                break;
            }
            summ = summ + Integer.parseInt(str);
        }
        System.out.println(summ);
        scanner.close();//напишите тут ваш код
    }
}
