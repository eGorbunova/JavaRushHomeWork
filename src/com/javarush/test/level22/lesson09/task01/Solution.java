
package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(new File(reader.readLine()));

        List<String> listOfWords = new ArrayList<>();

        while (in.hasNextLine()){
            Collections.addAll(listOfWords, (in.nextLine().split(" ")));
        }

        for (int i = 0; i < listOfWords.size()-1; i++){
            for (int k = i+1; k < listOfWords.size(); k++){
                StringBuilder sb = new StringBuilder(listOfWords.get(k)).reverse();
                if (listOfWords.get(i).toString().equals(sb.toString()))
                {
                    Pair newPair = new Pair();
                    newPair.first = listOfWords.get(i).toString();
                    newPair.second = listOfWords.get(k).toString();
                    result.add(newPair);
                    listOfWords.remove(k);
                    break;
                }
            }
        }

        for (Pair s: result){
            System.out.println(s.toString());
        }

        in.close();
        reader.close();
    }



    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
