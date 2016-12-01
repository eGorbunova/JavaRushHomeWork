package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigarray = new int[20];
        int[] smallarray1 = new int[10];
        int[] smallarray2 = new int[10];
        for (int i = 0; i < bigarray.length; i++) {
            bigarray[i] = Integer.parseInt(reader.readLine());
            if (i < smallarray1.length) {
                smallarray1[i] = bigarray[i];
            } else {
                smallarray2[i - smallarray1.length] = bigarray[i];
            }
        }
        for (int i = 0; i < smallarray2.length; i++) {
            System.out.println(smallarray2[i]);
        }
    }

}
