package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements Swim, Run{


        public void run() {

        }


        public void swim() {

        }
    }

    public class Duck implements Swim, Run, Fly{


        public void fly() {

        }


        public void run() {

        }


        public void swim() {

        }
    }

    public class Penguin implements Swim, Run{


        public void run() {

        }


        public void swim() {

        }
    }

    public class Airplane implements Run, Fly{


        public void fly() {

        }


        public void run() {

        }
    }
}
