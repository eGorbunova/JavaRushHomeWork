package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by Work on 29.09.2016.
 */
public class LoginCommand implements Command
{
    private static final String cardNumber = "123456789012";
    private static final String pinNumber = "1234";
    private boolean success = false;

    @Override
    public void execute() throws InterruptOperationException
    {
        do
        {
            ConsoleHelper.writeMessage("Введите номер карты:");
            String inputCard = ConsoleHelper.readString();

           // ConsoleHelper.writeMessage("Введите ПИН:");
            String inputPIN = ConsoleHelper.readString();
            if (!inputCard.matches("^\\d{12}$") || !inputPIN.matches("^\\d{4}$"))
            {
                ConsoleHelper.writeMessage("Ошибка ввода. Попробуйте еще раз.");
            }
            else
            {
                if (!inputCard.equals(cardNumber) || !inputPIN.equals(pinNumber))
                {
                    ConsoleHelper.writeMessage("Неверные данные. Попробуйте еще раз.");
                }
                else
                {
                    ConsoleHelper.writeMessage("Верификация пройдена успешно.");
                    success = true;
                }
            }
        } while (!success);
    }
}