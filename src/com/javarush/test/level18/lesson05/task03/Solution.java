package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
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

        FileInputStream inputStream = new FileInputStream(f1);
        FileOutputStream outputStream1 = new FileOutputStream(f2);
        FileOutputStream outputStream2 = new FileOutputStream(f3);
       // byte[] buffer = new byte[inputStream.available()] ;
        if (inputStream.available()>0){
            byte [] buffer1 = new byte[inputStream.available() - inputStream.available()/2];
            byte [] buffer2 = new byte[inputStream.available()/2];
            int count  = inputStream.read(buffer1);
            outputStream1.write(buffer1, 0, count);
            count  = inputStream.read(buffer2);
            outputStream2.write(buffer2, 0, count);
        }
            inputStream.close();
            outputStream1.close();
            outputStream2.close();

    }
}
