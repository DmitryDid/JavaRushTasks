package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human granFather1 = new Human("Рафаил", true, 70);//напишите тут ваш код
        Human granFather2 = new Human("Юра", true, 72);//напишите тут ваш код
        Human grandMother1 = new Human("Ира", false, 68);//напишите тут ваш код
        Human grandMother2 = new Human("Гидвига", false, 67);//напишите тут ваш код
        Human father = new Human("Андрей", true, 55, granFather2, grandMother1);//напишите тут ваш код
        Human mother = new Human("Ирина", false, 50, granFather1, grandMother2);//напишите тут ваш код
        Human child1 = new Human("Дима", true, 31, father, mother);//напишите тут ваш код
        Human child2 = new Human("Ира", false, 32, father, mother);//напишите тут ваш код
        Human child3 = new Human("Данил", true, 20, father, mother);//напишите тут ваш код

        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(granFather1);
        System.out.println(granFather2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















