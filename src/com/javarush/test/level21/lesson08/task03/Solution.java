package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;

        }
        @Override
        protected Object clone() throws CloneNotSupportedException
        {
            return new A(getI(),getJ());
        }
        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;
        @Override
        protected B clone() throws CloneNotSupportedException
        {
            throw new CloneNotSupportedException("no");
        }
        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }
        @Override
        protected C clone() throws CloneNotSupportedException
        {
            return new C(getI(),getJ(),getName()==null?null:getName());
        }
    }
}
