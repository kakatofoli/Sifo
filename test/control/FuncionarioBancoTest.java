/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Funcionario;
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
public class FuncionarioBancoTest {
    
    public FuncionarioBancoTest() {
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
     * Test of getInstance method, of class FuncionarioBanco.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        FuncionarioBanco expResult = null;
        FuncionarioBanco result = FuncionarioBanco.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class FuncionarioBanco.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Funcionario func = null;
        FuncionarioBanco instance = new FuncionarioBanco();
        boolean expResult = false;
        boolean result = instance.salvar(func);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class FuncionarioBanco.
     */
    @Test
    public void testRemover() throws Exception {
        System.out.println("remover");
        Funcionario func = null;
        FuncionarioBanco instance = new FuncionarioBanco();
        boolean expResult = false;
        boolean result = instance.remover(func);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
