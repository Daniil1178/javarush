package com.javarush.test.level14.lesson06.home01;

/**
 * Created by daniil on 24.01.15.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth(){

        return 400;
    }
    public String getDescription (){

        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";

    }

}
