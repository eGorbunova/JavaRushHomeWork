package com.javarush.test.level26.lesson15.big01;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Work on 28.09.2016.
 */
public final class CurrencyManipulatorFactory
{
    static HashMap<String, CurrencyManipulator> map = new HashMap<>();
    static boolean isExist = false;

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode)
    {
//        isExist = false;
//        CurrencyManipulator current;
//
//        if (map.containsKey(currencyCode))
//            return map.get(currencyCode);
//        else {
//            current = new CurrencyManipulator(currencyCode);
//            map.put(currencyCode, current);
//            return current;
//        }
        if (map.containsKey(currencyCode)) {
            return map.get(currencyCode);
        } else {
            CurrencyManipulator cur = new CurrencyManipulator(currencyCode);
            map.put(currencyCode, cur);
            return cur;
        }
    }

    private CurrencyManipulatorFactory()
    {
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators()
    {
        return map.values();
    }



}
