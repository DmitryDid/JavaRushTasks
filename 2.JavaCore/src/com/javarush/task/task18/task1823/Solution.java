package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (!(s = scanner.nextLine()).equals("exit")) {
            new ReadThread(s).start();
        }
        scanner.close();
//
        System.out.println(resultMap);
//

    }

    public static class ReadThread extends Thread {
        String fileame;

        public ReadThread(String fileName) {
            this.fileame = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            int maxCount = 0;
            int maxByte = 0;

            try (FileInputStream fis = new FileInputStream(fileame)){
                while (fis.available() > 0) {
                    int b = fis.read();
                    if (map.containsKey(b)) map.put(b, map.get(b) + 1);
                    else map.put( b, 1);
                }
            } catch (IOException e) {
            }
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getValue() > maxCount) {
                    maxCount = pair.getValue();
                    maxByte = pair.getKey();
                }
            }
            resultMap.put(fileame, (int)maxByte );
        }
    }
}
