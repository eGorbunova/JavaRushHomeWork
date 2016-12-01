package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution
{
    public static Map<String, String> properties = new HashMap<>();
    public static Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception
    {
        this.load(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
    }
    public void save(OutputStream outputStream) throws Exception
    {
        prop.store(outputStream, null);
    }
    public void load(InputStream inputStream) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        prop.load(reader);
        for(String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            properties.put(key, value);
        }
    }
}
