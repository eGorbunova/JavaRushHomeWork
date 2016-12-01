package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        if (a>b){
            if (b>c){
                System.out.print(a +" " + b + " " + c);
            }else {
                if (a>c){
                    System.out.print(a +" " + c + " " + b);
                }else {
                    System.out.print(c +" " + a + " " + b);
                }
            }
        }else {
            if (a>c){
                System.out.print(b +" " + a + " " + c);
            } else {
                if (b>c){
                    System.out.print(b + " " + c + " " + a);
                }else {
                    System.out.print(c +" " + b + " " + a);
                }
            }
        }

    }
}
