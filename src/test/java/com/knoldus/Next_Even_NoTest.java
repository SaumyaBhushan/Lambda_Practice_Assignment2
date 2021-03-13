package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Next_Even_NoTest {
    @Test
    public void findNextEvenNoFromEvenNum(){
        Next_Even_No objForTest = new Next_Even_No();
        Assertions.assertEquals(22,objForTest.CalcNextEvenNum("20"));
    }
    @Test
    public void findNextEvenNoFromOddNum(){
        Next_Even_No objForTest = new Next_Even_No();
        Assertions.assertEquals(22,objForTest.CalcNextEvenNum("21"));
    }

    @Test
    public void findNextEvenNoforLongNum(){
        Next_Even_No objForTest = new Next_Even_No();
        Assertions.assertEquals(216668478436488L,objForTest.CalcNextEvenNum("216668478436487"));
    }

    @Test
    public void checkForException() {
        Next_Even_No obj = new Next_Even_No();
        Assertions.assertThrows(NumberFormatException.class,()-> obj.CalcNextEvenNum("one"));
    }


}
