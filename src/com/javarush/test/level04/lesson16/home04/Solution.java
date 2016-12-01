package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        int y = Integer.parseInt(a1);
        int m = Integer.parseInt(b1);
        int d = Integer.parseInt(c1);

        System.out.println("Меня зовут " + name);
        System.out.print("Я родился " + d +"."+m+"."+y);
    }
}
