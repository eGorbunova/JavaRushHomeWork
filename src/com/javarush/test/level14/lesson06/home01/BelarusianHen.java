package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Work on 22.06.2016.
 */
class BelarusianHen extends Hen{
    public int getCountOfEggsPerMonth(){return 55;}
    String getDescription(){return (super.getDescription()+" Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.");}
    }
