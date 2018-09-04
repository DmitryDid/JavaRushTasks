package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            if (fileScanner.hasNextLine()) {
                String[] array = fileScanner.nextLine().split(" ");
                String date = String.format("%s/%s/%s", array[3], array[4], array[5]);

                SimpleDateFormat inDateFormat = new SimpleDateFormat();
                inDateFormat.applyPattern("dd/MM/yyyy");

                return  new Person(array[1], array[2], array[0], inDateFormat.parse(date));
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
