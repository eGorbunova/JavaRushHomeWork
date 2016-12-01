package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/


import java.io.FileInputStream;

import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        FileInputStream file = new FileInputStream(filename);
        int valueByte = file.available();
        int date = 0;
        int valueSpase = 0;
        while (file.available()>0){
            date = file.read();
            if (date == 32)
                valueSpase ++;
        }
        file.close();
        double a = (double) valueSpase/valueByte *100;
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(a);
        System.out.println(format);
    }
}