package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Work on 18.06.2016.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    public  String getCurrencyName(){
        return "HRN";
    }


}
