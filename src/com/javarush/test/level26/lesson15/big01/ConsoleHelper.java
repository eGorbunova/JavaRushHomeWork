package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

/**
 * Created by Work on 28.09.2016.
 */
public class ConsoleHelper
{
    //private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "common_en");
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException
    {
        String message = "";
        try
        {
            message = reader.readLine();
            if (message.equalsIgnoreCase("operation.EXIT"))
                throw new InterruptOperationException();
        }
        catch (IOException ignored)
        {
        }
        return message;
    }

    public static String askCurrencyCode() throws InterruptOperationException
    {
        String test;
        writeMessage("choose.currency.code");
        while (true)
        {
            test = readString();
            if (test.length() == 3)
                break;
            else
                writeMessage("invalid.data");

        }
        return test.toUpperCase();

    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException
    {
        String[] array;
        writeMessage("choose.denomination.and.count.format");

        while (true)
        {
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try
            {
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            }
            catch (Exception e)
            {
                writeMessage("invalid.data");
                continue;
            }
            if (k <= 0 || l <= 0 || array.length > 2)
            {
                writeMessage("invalid.data");
                continue;
            }
            break;
        }
        return array;
    }



    public static Operation askOperation() throws InterruptOperationException
    {
        while (true) {
            writeMessage("Выберите вашу операцию 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT: ");
            String input = readString();

                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(input));

        }
    }
}
