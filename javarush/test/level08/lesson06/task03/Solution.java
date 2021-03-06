package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        insert10000(list);
        Date currentTime = new Date();

        set10000(list);


        Date newTime = new Date();

        long ms = newTime.getTime() - currentTime.getTime();
        return ms;

    }

    public static void insert10000(List list)
    {
        for (int i=0;i<100000;i++)
        {
            list.add(0, new Object());

        }
    }
    public static void set10000(List list)
    {
        for (int i=0;i<100000;i++)
        {

            list.set(i, new Object());
        }
    }
}
