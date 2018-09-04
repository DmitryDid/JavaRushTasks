package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MMMMMMM d yyyy", Locale.US);
        Date dateIn = format.parse(date);

        String eayrFirstDay = "JANUARY 1 " + date.substring(date.length()-4, date.length());
//        System.out.println(eayrFirstDay);
        Date yearStart = format.parse(eayrFirstDay);
        long result = dateIn.getTime() - yearStart.getTime();
        long dayCount = result/86400000;
        return dayCount%2==0 ? true : false;
    }
}
