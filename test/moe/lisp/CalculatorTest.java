/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author koide
 */
public class CalculatorTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply02() throws Exception {
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected, actual);
    }
    /**
     * Test of multiply method, of class Calculator.
     */
    /*
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int x = 0;
        int y = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of max method, of class Calculator.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 0;
        int b = 0;
        int c = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
