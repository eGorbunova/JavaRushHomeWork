package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[10];
        String[] arr = new String[10];
        for (int i = 0; i < 10;i++){
            String s = reader.readLine();
            arr[i] = s;
           // for(int j = 0; j < numArr.length; j++){
            numArr[i] = s.length();
                //Инициализируйте (создайте и заполните) массив тут
            }


        for (int i = 0; i < numArr.length; i++)
        {
            System.out.println(numArr[i]);
        } //напишите тут ваш код

    }
}
