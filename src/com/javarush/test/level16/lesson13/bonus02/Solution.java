package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static {
        threads.add(new TestedThread1());
        threads.add(new TestedThread2());
        threads.add(new TestedThread3());
        threads.add(new TestedThread4());
        threads.add(new TestedThread5());
    }

    public static class TestedThread1  extends Thread {
         public void run() {
             while (true) {}
        }
    }

    public static class TestedThread2  extends Thread
    {
        public void run()
        {
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException x)
            {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class TestedThread3  extends Thread {

        public void run() {
            while (true)
            {
                try
                {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {}
            }
        }
    }

    public static class TestedThread4  extends Thread implements Message {
        public void run() {
            try {
                while (true){ Thread.sleep(1000);
               }
            }catch (InterruptedException e)
                 {  }
         }
        @Override
        public void showWarning(){
            this.interrupt();
            try
            {
                this.join();
            }catch (InterruptedException e){}
        }
    }

    public static class TestedThread5  extends Thread
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        public void run()
        {

            try
            {
                String line = reader.readLine();
                int sum = 0;
                while (!line.equals("N"))
                {
                    sum += Integer.parseInt(line);
                    line = reader.readLine();
                }
                System.out.println(sum);
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
