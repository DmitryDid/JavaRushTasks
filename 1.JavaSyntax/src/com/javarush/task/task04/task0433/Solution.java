package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int countOut = 10;
        while (countOut>0){
            int countIn = 10;
            while (countIn>0){
                System.out.print("S");
                countIn--;
            }
            System.out.println("");
            countOut--;
        }//напишите тут ваш код

    }
}
