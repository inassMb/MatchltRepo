/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.theaterapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.theaterapp.InvalidTypeException;
import com.mycompany.theaterapp.InvalidAgeException;

/**
 *
 * @author daga7362
 */
public class TheaterAppTest {
    
    public TheaterAppTest() {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /**
     * Test of main method, of class TheaterApp.
     */
  

    /**
     * Test of calculateTiketPrice method, of class TheaterApp.
     */
    
    
    
 @Test  
 public void testCalculateTiketPriceChildren() throws InvalidTypeException, InvalidAgeException{
    TheaterApp instance = new TheaterApp();
    double expResult = 0.0;
    
    for (int i = 1; i <= 4; i++) {
        System.out.println("calculateTiketPrice children " + i);
        int age = 3;
       int type = i;
            try {
                double result = instance.calculateTiketPrice(age, type);
                assertEquals(expResult, result, 0);
            } catch (InvalidTypeException e) {
                fail("Invalid type exception should not be thrown for children");
            }
    }
}
  
               
   @Test  
public void testCalculateTiketPriceTeenager() throws InvalidTypeException, InvalidAgeException {
    TheaterApp instance = new TheaterApp();
    
    double[] expResults = {45.0, 37.5, 30.0, 22.5};
    
    for (int i = 1; i <= 4; i++) {
        System.out.println("calculateTiketPrice Teenager " + i);
        int age = 10;
        int type = i;
        try {
                double result = instance.calculateTiketPrice(age, type);
                assertEquals(expResults[i - 1], result, 0);
            } catch (InvalidTypeException | InvalidAgeException e) {
                fail("Invalid type or age exception thrown for teenager");
            }
    }
}
                                                      
                
@Test
public void testCalculateTiketPriceAdult() throws InvalidTypeException, InvalidAgeException {
    TheaterApp instance = new TheaterApp();
    
    double[] expResults = {60.0, 50.0, 40.0, 30.0};
    
    for (int i = 1; i <= 4; i++) {
        System.out.println("calculateTiketPrice Adults " + i);
        int age = 20;
        int type = i;
        try {
                double result = instance.calculateTiketPrice(age, type);
                assertEquals(expResults[i - 1], result, 0);
            } catch (InvalidTypeException | InvalidAgeException e) {
                fail("Invalid type or age exception thrown for adult");
            }
    }
}

               
@Test
public void testCalculateTiketPriceOld() throws InvalidTypeException, InvalidAgeException {
    TheaterApp instance = new TheaterApp();
    
    double[] expResults = {30.0, 25.0, 20.0, 15.0};
    
    for (int i = 1; i <= 4; i++) {
        System.out.println("calculateTiketPrice old " + i);
        int age = 65;
        int type = i;
        try {
                double result = instance.calculateTiketPrice(age, type);
                assertEquals(expResults[i - 1], result, 0);
            } catch (InvalidTypeException | InvalidAgeException e) {
                fail("Invalid type or age exception thrown for old person");
            }
    }
}
 @Test
    public void testCalculateTiketPriceInvalidType() {
        TheaterApp instance = new TheaterApp();
        int age = 25;
        int invalidType = 5; // Type de siège invalide
        assertThrows(InvalidTypeException.class, () -> {
            instance.calculateTiketPrice(age, invalidType);
        });
    }

    @Test
    public void testCalculateTiketPriceNegativeAge() {
        TheaterApp instance = new TheaterApp();
        int negativeAge = -10; // Âge négatif
        assertThrows(InvalidAgeException.class, () -> {
            instance.calculateTiketPrice(negativeAge, 1);
        });
    }
}


