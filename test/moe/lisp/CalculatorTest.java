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
     * max関数のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (1, 2, 3) <br />
     * 期待する戻り値: 3 <br />
     */
    @Test
    public void testMax01() {
        System.out.println("max");
        int a = 1;
        int b = 2;
        int c = 3;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (1, 3, 2) <br />
     * 期待する戻り値: 3 <br />
     */
    @Test
    public void testMax02() {
        System.out.println("max");
        int a = 1;
        int b = 3;
        int c = 2;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (3, 2, 1) <br />
     * 期待する戻り値: 3 <br />
     */
    @Test
    public void testMax03() {
        System.out.println("max");
        int a = 3;
        int b = 2;
        int c = 1;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 全て同じ値の場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (1, 1, 1) <br />
     * 期待する戻り値: 1 <br />
     */
    @Test
    public void testMax04() {
        System.out.println("max");
        int a = 1;
        int b = 1;
        int c = 1;
        Calculator instance = new Calculator();
        int expResult = 1;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 二つの引数が同じ値かつそうでない引数が大きい場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (2, 1, 1) <br />
     * 期待する戻り値: 2 <br />
     */
    @Test
    public void testMax05() {
        System.out.println("max");
        int a = 2;
        int b = 1;
        int c = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 二つの引数が同じ値かつそうでない引数が大きい場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (1, 2, 1)
     * 期待する戻り値: 2
     */
    @Test
    public void testMax06() {
        System.out.println("max");
        int a = 1;
        int b = 2;
        int c = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 二つの引数が同じ値かつそうでない引数が大きい場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (1, 1, 2) <br />
     * 期待する戻り値: 2 <br />
     */
    @Test
    public void testMax07() {
        System.out.println("max");
        int a = 1;
        int b = 1;
        int c = 2;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 二つの引数が同じ値かつその引数が大きい場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (1, 2, 2)
     * 期待する戻り値: 2
     */
    @Test
    public void testMax08() {
        System.out.println("max");
        int a = 1;
        int b = 2;
        int c = 2;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 二つの引数が同じ値かつその引数が大きい場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (2, 1, 2)
     * 期待する戻り値: 2
     */
    @Test
    public void testMax09() {
        System.out.println("max");
        int a = 2;
        int b = 1;
        int c = 2;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
    
    /**
     * max関数のテスト <br />
     * 二つの引数が同じ値かつその引数が大きい場合のテスト <br />
     * 対象: max(int, int, int) <br />
     * 条件: (2, 2, 1)
     * 期待する戻り値: 1
     */
    @Test
    public void testMax10() {
        System.out.println("max");
        int a = 2;
        int b = 2;
        int c = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.max(a, b, c);
        assertEquals("Fail at a:" + String.valueOf(a) + ", b:" + String.valueOf(b) + ", c:" + String.valueOf(c) + ".", expResult, result);
    }
}
