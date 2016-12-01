package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("MAY 4 2015");;
    }

    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date(date);
        int year = date1.getYear();
        Date date0 = new Date();
        date0.setYear(year);
        date0.setMonth(0);
        date0.setDate(1);
        long msTimeDistance = date1.getTime()-date0.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        if (dayCount%2==0) return false;
        return true;
    }
}
