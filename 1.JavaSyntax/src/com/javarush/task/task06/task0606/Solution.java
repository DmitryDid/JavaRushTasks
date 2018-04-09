package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (true){
            if (number == 0)
                break;
            int temp = number%10;
            if (temp == 0){
            }else if (temp%2==0){
                even++;
            }else if (temp%2==1){
                odd++;
            }
            number = (number - temp)/10;
        }

        System.out.println("Even: " + even +  " Odd: " + odd);
        scanner.close();
    }
}
