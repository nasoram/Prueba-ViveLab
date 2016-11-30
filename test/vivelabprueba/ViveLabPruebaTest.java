/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivelabprueba;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nelson Sora
 */
public class ViveLabPruebaTest {
    
    public ViveLabPruebaTest() {
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
     * Test of verifyNumber method, of class ViveLabPrueba.
     */
    @Test
    public void testVerifyNumber() {
        System.out.println("verifyNumber");
        String text = "";
        boolean expResult = false;
        boolean result = ViveLabPrueba.verifyNumber(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pivot method, of class ViveLabPrueba.
     */
    @Test
    public void testPivot() {
        System.out.println("pivot");
        ArrayList<String> expResult = null;
        ArrayList<String> result = ViveLabPrueba.pivot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of translate method, of class ViveLabPrueba.
     */
    @Test
    public void testTranslate() {
        System.out.println("translate");
        ArrayList<String> numbers = null;
        long expResult = 0L;
        long result = ViveLabPrueba.translate(numbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
