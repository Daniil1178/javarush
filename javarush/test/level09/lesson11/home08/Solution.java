package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов
длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] temp = {5,2,4,7,0};

        try {

            for (int i = 0; i <temp.length ; i++)
            {
                int[] arrya = new int[temp[i]];
                for (int j = 0; j <arrya.length ; j++)
                {

                   arrya[i]=1;
                }
                arrayList.add(arrya);

            }

        } catch (Exception e){
         e.printStackTrace();
        }

        return arrayList;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
