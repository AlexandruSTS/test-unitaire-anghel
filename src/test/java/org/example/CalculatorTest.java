package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator underTest = new Calculator();

    @Test
    public void TestAddTwoPositiveIntegers(){
        //given
        //when
        int result = underTest.add(2, 3);
        //then
        int expected = 5;
        assertEquals(expected, result);
        //test comment
    }

    @Test
    public void TestAddPositiveAndNegativeIntegers(){
        //given
        //when
        int result = underTest.add(2, -3);
        //then
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void TestAddZeroAndNegativeIntegers(){
        //given
        //when
        int result = underTest.add(0, -3);
        //then
        int expected = -3;
        assertEquals(expected, result);
    }

    @Test
    public void TestAddZeroAndPositiveIntegers(){
        //given
        //when
        int result = underTest.add(0, 3);
        //then
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void TestAddTwoZeros(){
        //given
        //when
        int result = underTest.add(0, 0);
        //then
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void TestSubtractTwoPositiveIntegers(){
        //given
        //when
        int result = underTest.substract(3, 2);
        //then
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void TestSubtractTwoPositiveIntegersWithNegativeResult(){
        //given
        //when
        int result = underTest.substract(2, 3);
        //then
        int expected = -1;
        assertEquals(expected, result);
    }
}
