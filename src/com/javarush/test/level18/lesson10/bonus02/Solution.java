package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new LinkedList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        r.close();
        String line;
        int id,max=0;
        BufferedReader f = new BufferedReader(new FileReader(fileName));
        while ((line = f.readLine()) != null){
            list.add(line);
            id = Integer.parseInt(line.substring(0, 8).trim());
            if(id>max) max = id;
        }
        f.close();
        String price = args[args.length - 2];
        String quantity = args[args.length - 1];
        String productName = args[1];
//        for (int i = 1; i < args.length - 2; i++)
//            productName += args[i] + " ";
        String value = String.format("%-8s%-30s%-8s%-4s", String.valueOf(max+1), productName, price, quantity);
        list.add(value);
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
        for(String s : list){
            fileWriter.write(s);
            fileWriter.newLine();
        }
        fileWriter.close();
    }
}