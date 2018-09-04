package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surName;
        private int age;
        private boolean sex;
        private String address;
        private int phone;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surName, int age, boolean sex, String address, int phone) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.phone = phone;
        }

        public Human(String name, String surName) {
            this.name = name;
            this.surName = surName;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String address, int phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public Human(int age, boolean sex, String address, int phone) {
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.phone = phone;
        }

        public Human(String name, String surName, boolean sex, int phone) {
            this.name = name;
            this.surName = surName;
            this.sex = sex;
            this.phone = phone;
        }

        public Human(boolean sex, int phone) {
            this.sex = sex;
            this.phone = phone;
        }

        public Human(boolean sex, String address) {
            this.sex = sex;
            this.address = address;
        }

        public Human(String surName, int age, boolean sex) {
            this.surName = surName;
            this.age = age;
            this.sex = sex;
        }

        // напишите тут ваши переменные и конструкторы
    }
}
