package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberStrng = reader.readLine();
        int number = Integer.parseInt(numberStrng);
        reader.close();

        if ((number>0)&&(number<1000)){
            if (number%2==0){
                switch (numberStrng.length()){
                    case 1:
                        System.out.print("четное однозначное число");
                        break;
                    case 2:
                        System.out.print("четное двузначное число");
                        break;
                    case 3:
                        System.out.println("четное трехзначное число");
                        break;
                }
            }else{
                switch (numberStrng.length()){
                    case 1:
                        System.out.print("нечетное однозначное число");
                        break;
                    case 2:
                        System.out.print("нечетное двузначное число");
                        break;
                    case 3:
                        System.out.println("нечетное трехзначное число");
                        break;
                }
            }
        }//напишите тут ваш код
    }
}
