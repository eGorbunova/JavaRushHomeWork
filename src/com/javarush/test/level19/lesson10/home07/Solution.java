package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        String fileReader = args[0];
        String fileWriter = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(fileReader));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileWriter));
        String s = new String();
        while (reader.ready()){
            String line = reader.readLine();
            String[] strings = line.split(" ");
            for (int i = 0; i < strings.length; ++i) {
                if (strings[i].length() > 6){
                    s += strings[i] + ",";
                }
            }
        }
        writer.write(s.substring(0, s.length() -1));
        reader.close();
        writer.close();
    }
}