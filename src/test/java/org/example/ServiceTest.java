package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Mock
    Service serviceMock;

    @BeforeEach
    void setUp() {
        serviceMock = new Service();
    }

    @Test
    public void ShouldCallAddFunction() {
        //given
        int a = 3;
        int b = 2;
        String operation = "add";
        //when
        serviceMock.calculate(operation, a, b);
        //then
        verify
    }
}