package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //FileOutputStream inputStream = new FileOutputStream(reader.readLine());
        FileWriter writer = new FileWriter(reader.readLine());
        ArrayList<String > arrayList = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            arrayList.add(s);
            if (s.equals("exit")){


                for (String x: arrayList) {
                    writer.write(x);
                }
                break;

            }  arrayList.add("\n");
        }
        writer.close();

    }
}
