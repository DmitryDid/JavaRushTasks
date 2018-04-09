package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = scanner.nextInt();
        scanner.close();

        while (count>0){
            System.out.println(text);
            count--;
        }
        //напишите тут ваш код

    }
}
