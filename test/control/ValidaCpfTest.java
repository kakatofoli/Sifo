/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kaiqu
 */
public class ValidaCpfTest {
    
    public ValidaCpfTest() {
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
     * Test of isCPF method, of class ValidaCpf.
     */
    @Test
    public void testIsCPF() {
        System.out.println("isCPF");
        String CPF = "";
        boolean expResult = false;
        boolean result = ValidaCpf.isCPF(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeCPF method, of class ValidaCpf.
     */
    @Test
    public void testImprimeCPF() {
        System.out.println("imprimeCPF");
        String CPF = "";
        String expResult = "";
        String result = ValidaCpf.imprimeCPF(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
