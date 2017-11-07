package com.robby.utility;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Robby
 */
public class MyMathTest {

    public MyMathTest() {
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

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAdd01() throws Exception {
        System.out.println("add");
        Integer value1 = 2_000_000_000;
        Integer value2 = 1_000_000_000;
        expectedException.expect(Exception.class);
        MyMath.add(value1, value2);
    }

    @Test
    public void testMultiply01() throws Exception {
        System.out.println("multiply");
        Integer value1 = 50;
        Integer value2 = 50;
        Integer expResult = 2500;
        Integer result = MyMath.multiply(value1, value2);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply02() throws Exception {
        System.out.println("multiply");
        Integer value1 = 1_000_000;
        Integer value2 = 1_000_000;
        expectedException.expect(Exception.class);
        MyMath.multiply(value1, value2);
    }

}
