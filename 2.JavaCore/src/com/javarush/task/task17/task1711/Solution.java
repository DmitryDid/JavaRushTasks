package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i + 3 < args.length; i += 3) {
                        addNewPerson(args[i + 1], args[i + 2], args[i + 3]);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i + 4 <= args.length; i += 4) {
                        modifyPerson(args[i + 1], args[i + 2], args[i + 3], args[i + 4]);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 0; i + 1 < args.length; i++) {
                        deletePerson(args[i + 1]);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 0; i + 1 < args.length; i++) {
                        printPerson(args[i + 1]);
                    }
                }
                break;
        }
//        for (int i = 0; i < allPeople.size(); i++) {
//            System.out.println(allPeople.get(i).getName());
//            System.out.println(allPeople.get(i).getSex());
//            System.out.println(allPeople.get(i).getBirthDay());
//        }
    }

    public static void addNewPerson(String name, String sex, String br) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(br);
        Person person = sex.equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
        allPeople.add(person);
        System.out.println(allPeople.size() - 1);
    }

    public static void modifyPerson(String id, String name, String sex, String br) throws ParseException {
        Date newDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(br);
        Person personModify = allPeople.get(Integer.parseInt(id));
        personModify.setName(name);
        personModify.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
        personModify.setBirthDay(newDate);
    }

    public static void deletePerson(String id) {
        Person personDelete = allPeople.get(Integer.parseInt(id));
        personDelete.setName(null);
        personDelete.setSex(null);
        personDelete.setBirthDay(null);
    }

    public static void printPerson(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String date = newDateFormat.format(person.getBirthDay());
        System.out.printf("%s %s %s\n", person.getName(), sex, date);
    }
}
