package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        int day, month, year;
        Calendar birthdayCalendar = new GregorianCalendar();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()){
            String[] oneRow = fileReader.readLine().split(" ");
            year = Integer.parseInt(oneRow[oneRow.length - 1]);
            month = Integer.parseInt(oneRow[oneRow.length - 2]);
            day = Integer.parseInt(oneRow[oneRow.length - 3]);
            birthdayCalendar.set(year,month-1,day);
            String name = new String();
            for (int i = 0; i < oneRow.length - 3; i++)
                name += oneRow[i] + " ";
            PEOPLE.add(new Person(name.trim(), birthdayCalendar.getTime()));
        }
        fileReader.close();
    }
}
