package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Work on 18.06.2016.
 */
public class Computer
{
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    Computer(){
        this.keyboard =  new Keyboard();
        this.monitor = new Monitor();
        this.mouse = new Mouse();
}

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
