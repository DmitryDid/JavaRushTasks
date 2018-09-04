package com.javarush.task;

public class Easy {
    public static void main(String[] args) {
        String s1 = "+38(050)123-45-67";
        String s2 = "+3(805)0123-4567";
        String s3 = "+380(50)123-4567";
        System.out.println("callto://+" + s1.replaceAll("\\D", ""));
        System.out.println("callto://+" + s2.replaceAll("\\D", ""));
        System.out.println("callto://+" + s3.replaceAll("\\D", ""));
    }
}
