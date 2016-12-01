package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> arr = new ArrayList<String>(5);
        for (int i = 0; i < 5; i++) {
            arr.add(i, "wervwevtr");
        }
        System.out.println(arr.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }

    }
}
