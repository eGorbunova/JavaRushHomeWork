package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        boolean enter = true;
        String word = "";
        while (enter)
        {
            String text = reader.readLine();
            if (!text.equals("exit"))
            {
                word += text+String.format("%n");
            }
            else {
                enter = false;
                word += "exit";
                writer.write(word);
            }
        }
        writer.close();
        reader.close();
    }
}
