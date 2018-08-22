package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("end")) break;
            else list.add(s);
        }
        scanner.close();

        String fileNAme = list.get(0).substring(0, list.get(0).lastIndexOf("."));
        FileOutputStream fos = new FileOutputStream(fileNAme, true);

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            FileInputStream fis = new FileInputStream(list.get(i));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer);
            fos.flush();
            fis.close();
        }
        fos.close();
    }
}
