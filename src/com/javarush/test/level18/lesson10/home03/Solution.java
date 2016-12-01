package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();
        reader.close();

        FileInputStream inputStream1 = new FileInputStream(f2);
        FileInputStream inputStream2 = new FileInputStream(f3);
        FileOutputStream outputStream = new FileOutputStream(f1);

        byte[] buffer = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {
            int count = inputStream1.read(buffer);
            outputStream.write(buffer, 0 , count);
        }

        buffer = new byte[inputStream2.available()];
        while (inputStream2.available() > 0) {
            int count = inputStream2.read(buffer);
            outputStream.write(buffer, 0, count);
        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
        reader.close();

    }
}
