package com.javarush.test.level20.lesson10.bonus03;

import java.util.ArrayList;
import java.util.List;

/* Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> list = detectAllWords(crossword, "home", "same");
        for(Word qwe:list){
            System.out.println(qwe.toString());
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words){
        List<Word> list = new ArrayList<>();
        for(String asd:words) {
            if(!asd.isEmpty()){
                String word = asd;
                char[] clist = word.toCharArray();
                for (int i = 0; i < crossword.length; i++) {
                    for (int j = 0; j < crossword[i].length; j++) {
                        if (crossword[i][j] == clist[0]) {
                            ArrayList<Integer[]> koordinat = new ArrayList<>();
                            koordinat.add(new Integer[]{i, j});
                            String newword = clist[0] + "";
                            for (int z = 1; z < clist.length; z++) {
                                if (crossword[i].length > (j + z) && crossword[i][j + z] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i, j + z});
                                } else if (0 <= (j - z) && crossword[i][j - z] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i, j - z});
                                } else if (crossword.length > (i + z) && crossword[i + z][j] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i + z, j});
                                } else if (0 <= i - z && crossword[i - z][j] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i - z, j});
                                } else if (crossword[i].length > (j + z) && crossword.length > (i + z) && crossword[i + z][j + z] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i + z, j + z});
                                } else if (0 <= (j - z) && crossword.length > (i + z) && crossword[i + z][j - z] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i + z, j - z});
                                } else if (0 <= i - z && 0 <= j - z && crossword[i - z][j - z] == clist[z]) {
                                    newword += clist[z];
                                    koordinat.add(new Integer[]{i - z, j - z});
                                } else if (0 <= i - z && crossword[i].length > (j + z) && crossword[i - z][j + z] == clist[z]) {
                                    koordinat.add(new Integer[]{i - z, j + z});
                                    newword += clist[z];
                                } else {
                                    break;
                                }
                            }
                            if (newword.equals(word)) {
                                Word newrr = new Word(newword);
                                Integer a[] = koordinat.get(0);
                                newrr.setStartPoint(a[1], a[0]);
                                Integer b[] = koordinat.get(koordinat.size() - 1);
                                newrr.setEndPoint(b[1], b[0]);
                                list.add(newrr);
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;
        public Word(String text) {
            this.text = text;
        }
        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }
        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }
        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
