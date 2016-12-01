package com.javarush.test.level20.lesson10.bonus01;

import java.util.ArrayList;
import java.util.Arrays;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
*/
public class Solution {

        private static void addToDigitArr(int digital, int[] digitArr){
            if ((digitArr[digital] + 1) > 9){
                digitArr[digital] = 0;
                addToDigitArr(digital + 1,digitArr);
            } else{
                digitArr[digital] = digitArr[digital] + 1;
            }
        }
        public static int[] getNumbers(int N){
            int[] buffer = new int[10];
            int[] digitArr = new int[20];
            for (int t = 0; t < 10; t++){
                buffer[t] = myPow(t, 1);
            }
            int[] result = null;
            ArrayList<Integer> list = new ArrayList<Integer>();
            int digit = 1;
            int temp10 = 10;
            for (int i = 1; i < N; i++){
                addToDigitArr(0,digitArr);
                if (i == temp10){
                    temp10 = temp10 * 10;
                    digit++;
                    for (int t = 0; t < 10; t++){
                        buffer[t] = myPow(t, digit);
                    }
                }
                int sum = 0;
                for (int k = digit - 1; k >= 0; k--)
                {
                    sum = sum + buffer[digitArr[k]];
                    if (sum > i) break;
                }
                if (sum == i) list.add(i);
            }
            result = new int[list.size()];
            for (int i = 0; i < list.size(); i++)
            {
                result[i] = list.get(i);
            }
            return result;
        }
    private static int myPow(int a, int b)
    {
        int rez = 1;
        for (int i = 0; i < b; i++)
        {
            rez = rez * a;
        }
        return rez;
    }
}
