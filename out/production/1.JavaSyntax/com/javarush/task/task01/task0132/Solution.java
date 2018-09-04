package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int summ = 0;
        int end1 = number % 10;//6
        number = (number - end1) / 10;//54
        int end2 = number % 10;//4
        number = (number - end2) / 10;
        int end3 = number % 10;//5
        return end1 + end2 + end3;
    }
}