package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arrayList = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            arrayList.add(br.readLine());

        String minLength = arrayList.get(1);
        for (int i = 0; i < 5; i++){
            if (minLength.length() > arrayList.get(i).length())
                minLength = arrayList.get(i);
        }


        for (int i = 0; i < 5; i++) {
            if (minLength.length() == arrayList.get(i).length())
                System.out.println(arrayList.get(i));
        }

    }
}
