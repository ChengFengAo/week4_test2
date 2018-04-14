package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGameTest;

    @Before
    public void setup() {
        fizzBuzzGameTest=mock(FizzBuzzGame.class);
    }
    @Test
    public void test_Fizz_when_have_3() {
     when(fizzBuzzGameTest.fizz_when_have_3(13)).thenReturn("Fizz");
     when(fizzBuzzGameTest.fizz_when_have_3(12)).thenReturn("-1");
    }


    @Test
    public void test_when_multiplier_of_35_37_357() {
        when(fizzBuzzGameTest.when_multiplier_of_35_37_357(15)).thenReturn("FizzBuzz");
        when(fizzBuzzGameTest.when_multiplier_of_35_37_357(21)).thenReturn("FizzWhizz");
        when(fizzBuzzGameTest.when_multiplier_of_35_37_357(35)).thenReturn("BuzzWhizz");
        when(fizzBuzzGameTest.when_multiplier_of_35_37_357(1)).thenReturn("-1");

    }
    @Test
    public void test_when_multiplier_of_3_5_7()
    {
        when(fizzBuzzGameTest.when_multiplier_of_3_5_7(39)).thenReturn("Fizz");
        when(fizzBuzzGameTest.when_multiplier_of_3_5_7(25)).thenReturn("Buzz");
        when(fizzBuzzGameTest.when_multiplier_of_3_5_7(35)).thenReturn("Whizz");
    }

}
