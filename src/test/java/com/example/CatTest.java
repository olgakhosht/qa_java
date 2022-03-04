package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnCorrectValue() {
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnCorrectValue() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedList);
        List<String> actualList = cat.getFood();
        assertEquals(expectedList, actualList);
    }
}