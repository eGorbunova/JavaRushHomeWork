package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String mask = "[\\w\\d\\S]*\\d+[\\w\\d\\S]";
        Pattern pattern = Pattern.compile(mask);


        while (reader.ready())
        {
            String line = reader.readLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find())
            {
                writer.write(matcher.group() + " ");
            }
        }
        reader.close();
        writer.close();
    }
}