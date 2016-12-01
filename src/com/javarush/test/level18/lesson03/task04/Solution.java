package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileInputStream input = new FileInputStream(name);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (input.available() > 0)
        {
            list.add(input.read());
        }
        input.close();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : list)
        {
            int kol =0;
            for (int j: list)
            {
                if (i == j) kol++;
            }
            map.put(i,kol);
        }
        int min =999999999;
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() < min) min = entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() == min) System.out.print(entry.getKey() + " ");
        }
    }
}