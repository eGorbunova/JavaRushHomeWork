package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Work on 22.06.2016.
 */
class RussianHen extends Hen{
    int getCountOfEggsPerMonth(){return 60;}
    String getDescription(){return (super.getDescription()+" Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.");}
    }