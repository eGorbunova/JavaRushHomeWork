package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Work on 24.06.2016.
 */
public class Singleton
{
    private static Singleton i;
    public static Singleton getInstance()
    {

        if(i == null){
            i = new Singleton();
            return i;}
        else
            return i;
    }

    private Singleton()
    {

    }
}
