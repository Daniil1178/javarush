package com.javarush.test.level12.lesson02.task05;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат –
одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    public class Dog implements Run
    {
        public void run(){


        }
    }

    public class Fish implements Swim
    {
        public void swim(){}
    }

    public class Bird implements Fly

    {
        public void fly(){}
    }

    public class Airplane implements Run, Fly
    {
        public void run(){}
        public void fly(){}
    }
}