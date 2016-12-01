package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        List<String> stringList = new ArrayList<String>();
        String id = String.format("%-8.8s",args[1]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        if (args[0].equals("-u")){
            String productName = String.format("%-30.30s",args[2]);
            String price = String.format("%-8.8s",args[3] ) ;
            String quantity = String.format("%-4.4s", args[4]);
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                if (line.startsWith(id))
                {
                    stringList.add(id + productName + price + quantity);
                }
                else {
                    stringList.add(line);
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (String str : stringList){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        if (args[0].equals("-d")){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(id)){}
                else {
                    stringList.add(line);
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (String str : stringList){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        bufferedReader.close();
    }
}