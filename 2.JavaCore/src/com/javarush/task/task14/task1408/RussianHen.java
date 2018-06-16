package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    private int countEggs = 30;


    int getCountOfEggsPerMonth() {
        return countEggs;
    }


    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + countEggs + " яиц в месяц.";
    }
}
