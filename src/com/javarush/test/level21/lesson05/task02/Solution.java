package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (n == this)
            return true;
        if(n == null)
            return false;
        if(n.getClass() != this.getClass())
            return false;
        Solution object = (Solution) n;
        if (Objects.equals(first, object.first) && Objects.equals(last, object.last))
            return true;
        else
            return false;
    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        return 31 * result + (last != null ? last.hashCode() : 0);
    }
    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
