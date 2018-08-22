package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args[0].equals("-c")) {
            Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);
            Person person = args[2].equals("м") ? Person.createMale(args[1], date) : Person.createFemale(args[1], date);
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
        }

        if (args[0].equals("-u")) {
            Date newDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
            Person personModify = allPeople.get(Integer.parseInt(args[1]));
            personModify.setName(args[2]);
            personModify.setBirthDay(newDate);
            personModify.setSex(args[3].equals("m") ? Sex.MALE : Sex.FEMALE);
        }

        if (args[0].equals("-d")) {
            Person personDelete = allPeople.get(Integer.parseInt(args[1]));
            personDelete.setName(null);
            personDelete.setSex(null);
            personDelete.setBirthDay(null);
        }

        if (args[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
            SimpleDateFormat newDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date = newDateFormat.format(person.getBirthDay());
            System.out.printf("%s %s %s", person.getName(), sex, date);
        }
    }
}
