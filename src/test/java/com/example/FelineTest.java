package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    //private Feline feline;

    @Spy
    private Feline felineSpy = new Feline();

    @Test
    public void eatMeatReturnCorrectValue() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineSpy.getFood("Хищник")).thenReturn(expectedListFood);
        List<String> actualListFood = felineSpy.eatMeat();
        assertEquals(expectedListFood, actualListFood);
    }

    @Test
    public void getFamilyReturnCorrectValue() {
        String expectedFamily = "Кошачьи";
        String actualFamily = felineSpy.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnCorrectValue() {
        int expectedKittensCount = 1;
        //Mockito.when(felineSpy.getKittens(1)).thenReturn(expectedKittensCount);
        int actualKittensCount = felineSpy.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }
}