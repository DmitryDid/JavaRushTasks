package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();//напишите тут ваш код
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();//напишите тут ваш код
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();//напишите тут ваш код
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();//напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
    }
}
