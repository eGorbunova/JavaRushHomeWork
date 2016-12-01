package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Work on 18.06.2016.
 */
public class USD extends Money
{
    public USD(double amount){
        super(amount);
    }
    public  String getCurrencyName(){
        return "USD";
    }

}
