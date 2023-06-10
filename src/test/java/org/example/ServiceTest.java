package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
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
    @Test
    public void ArgumentShouldBeString(){
        //given
        int a = 5;
        int b = 6;
        String operation = "add";
        //when
        underTest.calculate(operation, a, b);
        //then
        ArgumentCaptor<Integer> argumentCaptorA = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor<Integer> argumentCaptorB = ArgumentCaptor.forClass(Integer.class);

        verify(calculator).add(argumentCaptorA.capture(), argumentCaptorB.capture());

        int capturedA = argumentCaptorA.getValue();
        int capturedB = argumentCaptorB.getValue();

        assertEquals(a, capturedA);
        assertEquals(b, capturedB);
    }
}