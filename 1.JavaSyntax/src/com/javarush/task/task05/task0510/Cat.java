package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){// Имя
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "grey";
    }

    public void initialize(String name, int weight, int age){// Имя, вес, возраст
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "grey";
    }//напишите тут ваш код


    public void initialize(String name, int age){// Имя, возраст (вес стандартный)
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "grey";
    }

    public void initialize(int weight, String color){// вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public void initialize(int weight, String color, String address){// вес, цвет, адрес (чужой домашний кот)
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
