/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.eggsorder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 30128198
 */
public class EggsOrderTest {
    
    public EggsOrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateTotalAmount method, of class EggsOrder.
     */
    @Test
    public void testCalculate1() {
        System.out.println("calculateTotalAmount");
        int eggs = 14;
        String expResult = "You ordered 14 eggs.\n" +
            "That is 1 dozen eggs at $7.25 per dozen and 2 additional eggs\n" +
            "at $0.75 each for a total of $8.75.";
        String result = EggsOrder.calculateTotalAmount(eggs);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculate2() {
        System.out.println("calculateTotalAmount");
        int eggs = 24;
        String expResult = "You ordered 24 eggs.\n" +
            "That is 2 dozen eggs at $7.25 per dozen and 0 additional eggs\n" +
            "at $0.75 each for a total of $14.50.";
        String result = EggsOrder.calculateTotalAmount(eggs);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculate3() {
        System.out.println("calculateTotalAmount");
        int eggs = 37;
        String expResult = "You ordered 37 eggs.\n" +
            "That is 3 dozen eggs at $7.25 per dozen and 1 additional eggs\n" +
            "at $0.75 each for a total of $22.50.";
        String result = EggsOrder.calculateTotalAmount(eggs);
        assertEquals(expResult, result);
    }
}
