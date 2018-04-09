package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
    Zerg[] zergs = new Zerg[10];
    Protoss[] protosses = new Protoss[5];
    Terran[] terrans = new Terran[12];

        for (int i = 0; i < terrans.length; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "terran" + i;
            if (zergs.length > i){
                zergs[i] = new Zerg();
                zergs[i].name = "zerg" + i;
            }
            if (protosses.length > i){
                protosses[i] = new Protoss();
                protosses[i].name = "protoss" + i;
            }
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
