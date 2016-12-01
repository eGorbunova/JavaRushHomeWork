package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String s = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
      //  FileWriter fileWriter = new FileWriter(new File(s));
        String line = "";
        StringBuffer words = null;
        String result = "";
        while ((line = fileReader.readLine())!= null) {
            words = new StringBuffer(line);
            words.reverse();

            result = words.toString();System.out.println(result);
           // fileWriter.write(result + "\n");
        }

        consoleReader.close();
        fileReader.close();

    }
}
