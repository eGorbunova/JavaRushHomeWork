package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream isr = new FileInputStream(reader.readLine());
            TreeSet<Integer> set = new TreeSet<>();
            while (isr.available() > 0) set.add(isr.read());

            reader.close();
            String ss = "";
            for (Integer s : set)
            {
                ss += s + " ";
            }
            System.out.println(ss.trim());
            isr.close();
        }

        catch (IOException e)

        {
        }
    }
}
