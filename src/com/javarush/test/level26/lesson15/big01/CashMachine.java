package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.command.CommandExecutor;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Locale;

/**
 * Created by Work on 28.09.2016.
 */
public class CashMachine
{
    public static void main(String[] args) throws IOException, InterruptOperationException
    {
        Locale.setDefault(Locale.ENGLISH);
        try
        {

            CommandExecutor.execute(Operation.LOGIN);
            Operation operation;
            do
            {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            }
            while (!operation.equals(Operation.EXIT));

        }catch (InterruptOperationException e) {
            //ConsoleHelper.writeMessage("Poka Poka");
            try {
                CommandExecutor.execute(Operation.EXIT);
            } catch (InterruptOperationException ignored) {
            }
           // ConsoleHelper.printExitMessage();
        }
    }
    }



