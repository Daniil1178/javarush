package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat("Vaska"));
        result.add(new Cat("Murzik"));
        result.add(new Cat("Boris"));
        result.add(new Cat("Matroskin"));
//Написать тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
//Написать тут ваш код
        HashSet<Dog> doggy = new HashSet<Dog>();
        doggy.add(new Dog("Bobik"));
        doggy.add(new Dog("Tuzik"));
        doggy.add(new Dog("Tishka"));
        return doggy;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
//Написать тут ваш код
        Set<Object> joined = new HashSet<Object>();
        Iterator dogsIterator = dogs.iterator();
        Iterator catsIterator = cats.iterator();
        while (dogsIterator.hasNext()){
            joined.add(dogsIterator.next());
        }
        while (catsIterator.hasNext()){
            joined.add(catsIterator.next());
        }
        return joined;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
//Написать тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
//Написать тут ваш код
        Iterator iterator = pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class Cat{
        public String name;
        public Cat(String name){
            this.name = name;

        }
        public String toString(){
            return "Кот " + name;
        }

    }
    public static class Dog {
        public String name;
        public Dog(String name){
            this.name = name;

        }

        public String toString(){
            return "Пёс " + name;
        }
    }
//Написать тут ваш код
}
