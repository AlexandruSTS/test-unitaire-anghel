package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    private Calculator calculator;

    Service underTest;

    @BeforeEach
    void setUp() {
        this.underTest = new Service(calculator);
    }

    @Test
    public void ShouldCallAddFunction() {
        //given
        int a = 3;
        int b = 2;
        String operation = "add";
        //when
        underTest.calculate(operation, a, b);
        //then
        verify(calculator).add(a, b);
    }

    @Test
    public void ShouldCallSubtractFunction() {
        //given
        int a = 3;
        int b = 2;
        String operation = "subtract";
        //when
        underTest.calculate(operation, a, b);
        //then
        verify(calculator).substract(a, b);
    }

    @Test
    public void ShouldReturnZero() {
        //given
        int a = 3;
        int b = 2;
        int expected = 0;
        String operation = "qqcqc";
        //when
        int actual = underTest.calculate(operation, a, b);
        //then
        assertEquals(expected, actual);
    }
}