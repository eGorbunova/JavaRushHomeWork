package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
  {
      Human gFather1 = new Human("Вася", true, 79, null, null);
      Human gFather2 = new Human("Сергей", true, 74, null, null);
      Human gMother1 = new Human("Анна", false, 75, null, null);
      Human gMother2 = new Human("Sonia", false, 70, null, null);
      Human father = new Human("Alex", true, 43, gFather1, gMother1);
      Human mother = new Human("Tania", false, 42, gFather2, gMother2);
      Human child1 = new Human("Antony", true, 18, father, mother);
      Human child2 = new Human("Lera", false, 17, father, mother);
      Human child3 = new Human("Katia", false, 15, father, mother);

      System.out.println(gFather1);
      System.out.println(gFather2);
      System.out.println(gMother1);
      System.out.println(gMother2);
      System.out.println(father);
      System.out.println(mother);
      System.out.println(child1);
      System.out.println(child2);
      System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother; //напишите тут ваш код

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

    }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
   }

}
