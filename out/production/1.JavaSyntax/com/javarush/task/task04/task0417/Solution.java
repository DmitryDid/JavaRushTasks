package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int c = Integer.parseInt(reader.readLine());
        reader.close();

        if ((a == b) && (b == c)) {
            System.out.printf("%s %s %s", a, b, c);
        } else if (a == b) {
            System.out.printf("%s %s", a, b);
        } else if (a == c) {
            System.out.printf("%s %s", a, c);
        } else if (b == c) {
            System.out.printf("%s %s", b, c);
        }
    }
}
