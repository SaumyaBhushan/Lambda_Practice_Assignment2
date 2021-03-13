package com.knoldus;


import java.util.function.Function;

public class Next_Even_No {

    public long CalcNextEvenNum(String num) {

        Function<Long, Long> operator = x -> x + 2 - (x % 2);

        try {
            return operator.apply(Long.parseLong(num));
        } catch (Exception e) {
            System.out.println(" Enter Number only in numerical format " + e);
            throw new NumberFormatException();
        }
    }
}
