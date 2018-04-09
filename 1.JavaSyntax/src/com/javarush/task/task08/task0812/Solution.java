package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int countCurent = 1;
        int countMax = 1;

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1)==list.get(i)){
                countCurent++;
                if (countCurent>countMax){
                    countMax = countCurent;
                }
            }else
                countCurent = 1;
        }

        System.out.println(countMax);
    }
}