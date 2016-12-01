package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        int[] a = new int[maximum];
        for (int i=0; i<maximum; i++)
        {
            a[i] = Integer.parseInt(reader.readLine());
        }

        int m = a[0];

        for (int j=1;j<a.length; j++)
        {
            if(m<=a[j]) m=a[j];
        }

        System.out.println(m);
    }
}
