package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human child1 = new Human("child1", true, 5);
        Human child2 = new Human("child2", true, 6);
        Human child3 = new Human("child3", true, 7);
        Human papa = new Human("papa", true, 40,child1,child2,child3);//напишите тут ваш код
        Human mama = new Human("mama", false, 36,child1,child2,child3);//напишите тут ваш код
        Human ded1 = new Human("ded1", true, 60, papa);//напишите тут ваш код
        Human ded2 = new Human("ded2", true, 62, mama);//напишите тут ваш код
        Human baba1= new Human("baba1", false, 56, papa);//напишите тут ваш код
        Human baba2 = new Human("baba2", false, 57, mama);//напишите тут ваш код
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, Human...child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
            for (Human h:child){
                this.children.add(h);
            }
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
