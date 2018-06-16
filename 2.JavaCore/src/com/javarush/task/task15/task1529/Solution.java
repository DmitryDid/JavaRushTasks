package com.javarush.task.task15.task1529;

import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();//add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("helicopter")) result = new Helicopter();
        if (s.equals("plane")) result = new Plane(scanner.nextInt());
        scanner.close();
    }
}
