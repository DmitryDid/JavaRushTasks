package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //подсчет букв в словах
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                char c = list.get(i).charAt(j);
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    count++;
                    map.put(c, count);
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + map.get(abcArray[i]));
        }
    }
}