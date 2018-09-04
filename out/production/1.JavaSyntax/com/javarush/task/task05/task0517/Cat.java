package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "grey";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 3;
        color = "grey";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;

    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        age = 2;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "grey";
    }



    public static void main(String[] args) {

    }
}
