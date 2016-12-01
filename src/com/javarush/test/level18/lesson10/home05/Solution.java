package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        FileWriter fileWriter = new FileWriter(fileName2);
        String[] lines;
        while (reader1.ready()) {
            lines = reader1.readLine().split(" ");
            for (String s : lines){
                fileWriter.write( Math.round(Double.parseDouble(s))+ " ");
            }

        }
        reader.close();
        reader1.close();
        fileWriter.close();
    }
}