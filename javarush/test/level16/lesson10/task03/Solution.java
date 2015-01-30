package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

import sun.awt.windows.ThemeReader;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
       TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {





        public void run(){
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {}
        }
    }
}
