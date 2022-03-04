package com.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class LionExceptionTest {
    Feline feline;

    @Test
    public void lionCheckException() {
        Exception exception = null;
        try {
            Lion lion = new Lion("Иной", feline);
        } catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}