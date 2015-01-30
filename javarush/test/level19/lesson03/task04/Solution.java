package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{

        Scanner scanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            Person person = null;
            String line = scanner.nextLine();
            String[] str = line.split(" ");
            int day = Integer.parseInt(str[3]);
            int month = Integer.parseInt(str[4]) - 1;
            int year = Integer.parseInt(str[5]);
            Calendar date = new GregorianCalendar(year,month,day);
            person = new Person(str[1],str[2],str[0],date.getTime());

            return person;
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}