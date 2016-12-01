package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Work on 22.06.2016.
 */
class UkrainianHen extends Hen{
    int getCountOfEggsPerMonth(){return 34;}
    String getDescription(){return (super.getDescription()+" Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.");}
    }
