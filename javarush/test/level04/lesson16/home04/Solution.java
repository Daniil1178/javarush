package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*String name = reader.readLine();

String y = reader.readLine();
int year = Integer.parseInt(y);
String m = reader.readLine();
int month = Integer.parseInt(m);
String d = reader.readLine();
int day = Integer.parseInt(d);*/
        String name = br.readLine();
        int year = Integer.parseInt( br.readLine() );
        int month = Integer.parseInt( br.readLine() );
        int day = Integer.parseInt( br.readLine() );


        System.out.println(" Меня зовут " + name);
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}
