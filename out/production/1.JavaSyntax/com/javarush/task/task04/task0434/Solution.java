package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int countOut = 1;
        while (countOut<=10){

            int countIn = 1;
            while (countIn<=10){
                System.out.print(countOut*countIn);
                System.out.print(" ");
                countIn++;
            }

            System.out.println();
            countOut++;
        }//напишите тут ваш код

    }
}
