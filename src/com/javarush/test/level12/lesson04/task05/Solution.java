package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int max(int n, int s){
        int max = 0;
        if (n>s)
            max = n;
        else
            max = s;
        return max;
    }

    public static long max (long n, long s){
        long max = 0;
        if (n>s)
            max = n;
        else
            max = s;
        return max;
    }
    public static double max (double n, double s){
        double max = 0;
        if (n>s)
            max = n;
        else
            max = s;
        return max;
    }
}
