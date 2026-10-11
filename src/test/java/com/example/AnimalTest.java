package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFamilyReturnsGeneralFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionForUnknownKind() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Всеядное");
    }
}