package com.javarush.task.task15.task1527;

import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        String url = new Scanner(System.in).nextLine();
        String paramURL = url.split("\\?")[1];
        String[] params = paramURL.split("&");
        String objValue = null;
        String result = "";

        for (String s : params) {
            String pName = s.split("=")[0];
            if (pName.equals("obj")) objValue = s.split("=")[1];
            result = result + pName + " ";
        }
        System.out.println(result.trim());

        if (url.contains("obj")) {
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
