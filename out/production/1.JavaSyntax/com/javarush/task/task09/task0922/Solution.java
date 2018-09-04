package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
//        String date = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String date = "08/18/2013";

        SimpleDateFormat inDateFormat = new SimpleDateFormat();
        inDateFormat.applyPattern("MM/dd/yyyy");
        Date inDate = inDateFormat.parse(date);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        System.out.println(simpleDateFormat.format(inDate).toUpperCase());

    }
}
