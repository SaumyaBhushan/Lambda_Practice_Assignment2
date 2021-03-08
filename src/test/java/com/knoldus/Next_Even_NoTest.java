package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Next_Even_NoTest {
    @Test
    public void findNextEvenNoFromEvenNum(){
        Assertions.assertEquals(22,Next_Even_No.operator.apply(20L));
    }
    @Test
    public void findNextEvenNoFromOddNum(){
        Assertions.assertEquals(22,Next_Even_No.operator.apply(21L));
    }


}
