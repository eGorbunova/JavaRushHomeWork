package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args)
    {
        PrintStream stream= System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String s= byteArrayOutputStream.toString();
        String[] a= s.split(" ");
        int res=0;
        switch (a[1]){
            case "+":
                res = (Integer.parseInt(a[0])) +  (Integer.parseInt(a[2]));
                break;
            case "*":
                res = (Integer.parseInt(a[0])) * (Integer.parseInt(a[2]));
                break;
            case "-":
                res = (Integer.parseInt(a[0])) -  (Integer.parseInt(a[2]));
                break;
        }
        System.setOut(stream);
        System.out.println(s + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

