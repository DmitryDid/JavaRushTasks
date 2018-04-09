package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();//напишите тут ваш код

    public Cat() {

    }

    public static void main(String[] args) {
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }//напишите тут ваш код
    }
}
