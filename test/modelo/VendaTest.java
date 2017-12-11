/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
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
public class VendaTest {
    
    public VendaTest() {
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
     * Test of getNome method, of class Venda.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Venda instance = new Venda();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Venda.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Venda instance = new Venda();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Venda.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Venda instance = new Venda();
        float expResult = 0.0F;
        float result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Venda.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        float Valor = 0.0F;
        Venda instance = new Venda();
        instance.setValor(Valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Venda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Venda instance = new Venda();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Venda.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int Quantidade = 0;
        Venda instance = new Venda();
        instance.setQuantidade(Quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class Venda.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Venda instance = new Venda();
        int expResult = 0;
        int result = instance.getValorTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotal method, of class Venda.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        int ValorTotal = 0;
        Venda instance = new Venda();
        instance.setValorTotal(ValorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCod method, of class Venda.
     */
    @Test
    public void testGetCod() {
        System.out.println("getCod");
        Venda instance = new Venda();
        String expResult = "";
        String result = instance.getCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod method, of class Venda.
     */
    @Test
    public void testSetCod() {
        System.out.println("setCod");
        String Cod = "";
        Venda instance = new Venda();
        instance.setCod(Cod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class Venda.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Venda instance = new Venda();
        List<Produto> expResult = null;
        List<Produto> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
