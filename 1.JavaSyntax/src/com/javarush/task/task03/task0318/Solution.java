package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();

        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!", name, number);//напишите тут ваш код
    }
}
