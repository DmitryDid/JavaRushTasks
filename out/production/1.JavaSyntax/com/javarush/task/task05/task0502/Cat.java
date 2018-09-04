package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int powerThisCat = this.age + this.weight + this.strength;
        int powerAnotherCat = anotherCat.age + anotherCat.weight + anotherCat.strength;
        if (powerThisCat > powerAnotherCat){
            return true;
        }return false;//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
