package com.knoldus;


import java.util.function.Function;

public class Next_Even_No {

    static Function <Long,Long> operator = x -> x + 2 - (x % 2);
}
