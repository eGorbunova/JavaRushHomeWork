package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;
import java.io.IOException;
import java.util.List;
public class Order
{
    public Tablet tablet;



    public static List<Dish> dishes;
    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        this.dishes= ConsoleHelper.getAllDishesForOrder();
    }
    @Override
    public String toString()
    {
        if (dishes.isEmpty())
            return "";
        else return "Your order: " + dishes +" of "+  tablet;
    }

    public int getTotalCookingTime() {
        int totalDuration = 0;
        for (Dish dish : dishes) {
            totalDuration += dish.getDuration();
        }
        return totalDuration;
    }

    public boolean isEmpty() {
        return dishes == null || dishes.isEmpty();
    }

    public static List<Dish> getDishes()
    {
        return dishes;
    }

    public Tablet getTablet()
    {
        return tablet;
    }
}