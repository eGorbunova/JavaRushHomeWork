package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        int summa = 0;
        for(;;){
            a = reader.readLine();
            if (!a.equals("сумма")){
                int  a1 = Integer.parseInt(a);
                summa = summa + a1;
          }else {
                System.out.print(summa);
                break;
            }
        }

        //напишите тут ваш код
    }
}
