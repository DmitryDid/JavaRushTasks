package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new Scanner(System.in).nextLine());
        int count = 0;

        while (fis.available() > 0){
            if(fis.read()==',')count++;
        }
        fis.close();
        System.out.println(count);
    }

//        FileReader reader = new FileReader(new Scanner(System.in).nextLine());
//        int count = 0;
//
//        while (reader.ready()) {
//            if (reader.read() == ',') count++;
//        }
//        reader.close();
//
//        System.out.println(count);
//    }
}
