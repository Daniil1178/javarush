package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map    = new HashMap<String, String>();
        for (int i=0; i<10; i++){
            map.put("фамилия"+i, "имя"+i);
        }

        return map;



    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            String s = pair.getValue();
            if (s.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (String pair : map.keySet()){
            String s = pair;
            if (s.equals(familiya)) count++;
        }
        return count;

    }
}
