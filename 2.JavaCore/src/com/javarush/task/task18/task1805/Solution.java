package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new Scanner(System.in).nextLine());
        TreeSet<Integer> set = new TreeSet<>();
        while (fis.available() > 0) set.add(fis.read());
        for (Integer i : set) System.out.print(i + " ");
        fis.close();
    }
}
