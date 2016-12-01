package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> ch= new ArrayList<Human>();
        ch.add(new Human("sdf",true,3));
        ch.add(new Human("sdd",true,3));
        ch.add(new Human("sdd",true,3));
        //папа мама и их список для добавления дедушкам - бабушкам
        Human f = new Human("pap",true,3,ch);
        Human m = new Human("mam",false,3,ch);
        ArrayList<Human> father= new ArrayList<Human>();
        ArrayList<Human> mother= new ArrayList<Human>();
        father.add(f);
        mother.add(m);
        //дедушки бабушки
        Human gf1 = new Human("ded1",true,3,father);
        Human gf2 = new Human("ded2",true,3,mother);
        Human gm1 = new Human("bab1",false,3,father);
        Human gm2 = new Human("bab2",false,3,mother);
        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        for(int i = 0; i < ch.size(); i++)
             System.out.println(ch.get(i));

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, boolean sex, int age, ArrayList<Human> children){
                this.name = name;
                this.sex = sex;
                this.age = age;
                this.children = children;
         }

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
