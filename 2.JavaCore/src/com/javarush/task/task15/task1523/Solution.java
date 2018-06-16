package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int i;
    String s;
    double d;

    public Solution() {
    }

    Solution(int i) {
        this.i = i;
    }

    private Solution(String s) {
        this.s = s;
    }

    protected Solution(int i, String s, double d) {
        this.i = i;
        this.s = s;
        this.d = d;
    }

    public static void main(String[] args) {

    }



}

