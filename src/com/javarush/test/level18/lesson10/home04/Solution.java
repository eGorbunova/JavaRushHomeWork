package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();
        String firstfilename = reader.readLine();
        String secondfilename = reader.readLine();

        InputStream inputStream = new FileInputStream(firstfilename);
        InputStream inputStream1 = new FileInputStream(secondfilename);
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            list.add(data);
        }
        OutputStream outputStream = new FileOutputStream(firstfilename);
        while (inputStream1.available() > 0){
            int data = inputStream1.read();
            outputStream.write(data);
        }
        for (int a : list){
            outputStream.write(a);
        }
        inputStream.close();
        inputStream1.close();
        outputStream.close();
        reader.close();
    }
}
