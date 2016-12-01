package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
//               Map<String, Integer> map = new HashMap<String, Integer>();
//        map.put("January", 1);
//        map.put("February", 2);
//        map.put("March", 3);
//        map.put("April", 4);
//        map.put("May", 5);
//        map.put("June", 6);
//        map.put("July", 7);
//        map.put("August", 8);
//        map.put("September", 9);
//        map.put("October", 10);
//        map.put("November", 11);
//        map.put("December", 12);
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int s = Integer.parseInt(reader.readLine());
//        for (Map.Entry<String, Integer> m : map.entrySet())
//        {
//            if (s == m.getValue())
//            System.out.println(m.getKey() + " is " + m.getValue() + " month");
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();//напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        for (int i = 0; i <list.size() ; i++)
        {
            if(m.equals(list.get(i))) System.out.println(m + " is " + (i+1) +" month");
        }
    }
 }



