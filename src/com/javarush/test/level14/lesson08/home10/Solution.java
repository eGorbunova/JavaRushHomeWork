package com.javarush.test.level14.lesson08.home10;

import java.util.LinkedList;
import java.util.List;

/* ��������� 4 ������
��������� 4 ������ � ������������ NotIncapsulatedClass � ����������� ���
1. � ����� NotIncapsulatedClass ������� private ������ initList(List<Number> list), printListValues, processCastedObjects.
2. ����� initList ������ ��������� ���������� �������� �������� list:
- ����� ������ ���� ���� � ������������, � ������� list ����������� ����������
- �������� ��� � ����� initList
- ����� ����������� list.
3. ����� printListValues ������ ��������� �������� list � ������� � ������� ��� �������� �� ������ list:
- ����� ������ �� ����������
- ����� ������ ���� ���� � ������������, � ������� � ����� �� ������ list ��������� � ������� ��� ��������
- �������� ��� � ����� printListValues
- ������� 2 ������ � ���� ������.
4. ����� processCastedObjects:
- �������� �������� ������ ����� ��� List<Number> list
- ����� ������ �� ����������
- ����� ������ ���� ���� � ������������, � ������� � ����� ��� ������� ������� �� ������ list ����������� ��� ���
- �������� ���� ���� � ����� processCastedObjects
- ������� 2 ������ � ���� ������
- ����, ��� ��� ������� ���� Float ����� ������� "Is float value defined? " + [Float_object].isNaN()
- ����, ��� ��� ������� ���� Double ����� ������� "Is double value infinite? " + [Double_object].isInfinite().
*/

public class Solution
{
     public static void main(String[] args)
    {
        new NotIncapsulatedClass();
    }
    public static class NotIncapsulatedClass
    {
        public NotIncapsulatedClass()
        {
            List<Number> list = new LinkedList<Number>();
            //1
            initList(list);

            //2 - ������� 2 ������
            printListValues(list);
            //3
            processCastedObjects(list);
        }
        private List<Number> initList(List<Number> list){
            list.add(new Double(1000f));
            list.add(new Double("123e-445632"));
            list.add(new Float(-90 / -3));
            list.remove(new Double("123e-445632"));
            return list;
        }
        private void printListValues(List list){
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));
            }
        }
        private void processCastedObjects(List<Number> list){
            for (Number object : list)
            {
                //������� 2 ������
                if (object instanceof Double)
                {
                    Double a = (Double) object;
                    System.out.println("Is double value infinite? " + a.isInfinite());
                } else if (object instanceof Float)
                {
                    Float a = (Float) object;
                    System.out.println("Is float value defined? " + a.isNaN());
                }
            }
        }
    }
}