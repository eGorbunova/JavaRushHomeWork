package com.javarush.test.level21.lesson16.big01;



import java.util.ArrayList;

/**
 * Created by Work on 11.08.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();
    public static void main (String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Belka", 3, 0));
        game.getHorses().add(new Horse("Strelka", 3, 0));
        game.getHorses().add(new Horse("Burka", 3, 0));
        game.run();
        game.printWinner();
    }

    public  ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void move(){
        for (Horse horse : getHorses()) {
            horse.move();
        }

    }

    public void run() throws InterruptedException
    {
        for(int i = 0; i < 100;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void print(){
        for (Horse horse : getHorses()) {
            horse.print();
            System.out.println();
            System.out.println();
        }

    }
    public Horse getWinner(){
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() +"!");
    }

}
