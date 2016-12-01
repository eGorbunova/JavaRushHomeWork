package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        int count = 0;
        while (fileReader.ready()){
            String [] words = fileReader.readLine().split("\\W");
            for (String word : words)
            {
                if ("world".equalsIgnoreCase(word)) count++;
            }
        }
        System.out.println(count);
        consoleReader.close();
        fileReader.close();
    }
}