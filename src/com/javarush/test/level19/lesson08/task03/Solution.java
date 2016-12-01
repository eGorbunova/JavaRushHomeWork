package com.javarush.test.level19.lesson08.task03;

/* Выводим только цифры
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить только цифры
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.

Пример вывода:
12345678
*/





import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consolestream = System.out;
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(byteOutputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consolestream);
        char[] res = byteOutputStream.toString().toCharArray();
        char[] exnum = {'1','2','3','4','5','6','7','8','9','0'};
        for (int i=0 ;i< res.length;i++)
        {
            for (int j =0 ;j< exnum.length;j++)
            {
                if (res[i]==exnum[j])
                    System.out.print(res[i]);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
