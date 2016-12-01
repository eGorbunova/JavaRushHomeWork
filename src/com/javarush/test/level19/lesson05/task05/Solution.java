package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(rdr.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(rdr.readLine()));
        String line="";
        while ((line=fr.readLine())!=null){

            fw.write(line.replaceAll("\\p{Punct}",""));
        }
        rdr.close();
        fr.close();
        fw.close();
    }
}
