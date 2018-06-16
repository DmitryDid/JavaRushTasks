package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    private int countEggs = 10;


    int getCountOfEggsPerMonth() {
        return countEggs;
    }


    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + countEggs + " яиц в месяц.";
    }
}
