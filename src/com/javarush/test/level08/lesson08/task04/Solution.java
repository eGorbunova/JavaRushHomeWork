package com.javarush.test.level08.lesson08.task04;


import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("St", new Date("JUNE 1 1980"));
        map.put("Stal", new Date("JUNE 1 1980"));
        map.put("Stall", new Date("JUNE 1 1980"));
        map.put("Stallo", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("JUNE 1 1980"));
        map.put("Stalone", new Date("JUNE 1 1980"));
        map.put("Stane", new Date("JUNE 1 1980"));
        map.put("Slone", new Date("JUNE 1 1980"));
        map.put("Sallon", new Date("JUNE 1 1980"));

        return (HashMap) map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if ( value.getMonth() > 4 & value.getMonth() < 8)
                iterator.remove();
        }
    }
}
