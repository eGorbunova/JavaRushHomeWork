package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Work on 11.08.2016.
 */
public class Horse
{
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void move(){
        distance += getSpeed()*Math.random();
    }

    public void print(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Math.round(getDistance()); i++ )
        {
            s.append(".");
        }
        System.out.println(s.toString() + getName());
    }
}
