package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int m = Integer.parseInt(a1);
        int n = Integer.parseInt(b1);//напишите тут ваш код

        for (int i=0; i< m; i++){
            for (int j=0; j<n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
