package com.robby.dao;

import com.robby.entity.Department;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Robby
 */
public class DepartmentDaoImplIT {

    public DepartmentDaoImplIT() {
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

    /**
     * Test of addData method, of class DepartmentDaoImpl.
     */
    @Test
    public void testAddData01() {
        Department object = new Department();
        object.setCode("22");
        object.setName("Teknik Elektro");
        DepartmentDaoImpl instance = new DepartmentDaoImpl();
        int expResult = 1;
        int result = instance.addData(object);
        Assert.assertEquals(expResult, result);
        System.out.println("Result add data test 01: " + result);
    }

    /**
     * Test of addData method, of class DepartmentDaoImpl.
     */
    @Test
    public void testAddData02() {
        Department object = new Department();
        object.setName("Teknik Industri");
        DepartmentDaoImpl instance = new DepartmentDaoImpl();
        int expResult = 0;
        int result = instance.addData(object);
        Assert.assertEquals(expResult, result);
        System.out.println("Result add data test 02: " + result);
    }

    /**
     * Test of showAllData method, of class DepartmentDaoImpl.
     */
    @Test
    public void testShowAllData() {
        System.out.println("showAllData");
        DepartmentDaoImpl instance = new DepartmentDaoImpl();
        List<Department> result = instance.showAllData();
        Assert.assertNotNull(result);
    }
}
