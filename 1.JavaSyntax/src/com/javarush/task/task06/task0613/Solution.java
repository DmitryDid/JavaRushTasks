package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();//создай 10 котов
        Cat cat2 = new Cat();//создай 10 котов
        Cat cat3 = new Cat();//создай 10 котов
        Cat cat4 = new Cat();//создай 10 котов
        Cat cat5 = new Cat();//создай 10 котов
        Cat cat6 = new Cat();//создай 10 котов
        Cat cat7 = new Cat();//создай 10 котов
        Cat cat8 = new Cat();//создай 10 котов
        Cat cat9 = new Cat();//создай 10 котов
        Cat cat10 = new Cat();//создай 10 котов
        System.out.println(Cat.catCount);
        //выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;//создай статическую переменную catCount

        public Cat() {
            catCount++;
        }

        //создай конструктор
    }
}
