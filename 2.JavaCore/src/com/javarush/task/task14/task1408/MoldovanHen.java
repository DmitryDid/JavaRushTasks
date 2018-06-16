package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    private int countEggs = 20;


    int getCountOfEggsPerMonth() {
        return countEggs;
    }


    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + countEggs + " яиц в месяц.";
    }
}
