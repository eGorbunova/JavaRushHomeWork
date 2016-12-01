package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream isr = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (isr.available()>0)
        {
            int temp = isr.read();
            while (list.size() - 1 <= temp)
            {
                list.add(0);
            }
            list.set(temp, list.get(temp) + 1);
        }
        int max = list.get(0);
        for(Integer x : list)
        {
            if (x > max)
            {
                max = x;
            }
        }
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == max)
            {
                System.out.println(i);
            }
        }
        isr.close();
    }
}