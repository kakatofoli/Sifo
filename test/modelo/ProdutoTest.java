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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getValor method, of class Produto.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Produto.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        float valor = 0.0F;
        Produto instance = new Produto();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Produto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Produto instance = new Produto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Produto instance = new Produto();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodBarras method, of class Produto.
     */
    @Test
    public void testGetCodBarras() {
        System.out.println("getCodBarras");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getCodBarras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodBarras method, of class Produto.
     */
    @Test
    public void testSetCodBarras() {
        System.out.println("setCodBarras");
        String CodBarras = "";
        Produto instance = new Produto();
        instance.setCodBarras(CodBarras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Produto.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Produto.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int Quantidade = 0;
        Produto instance = new Produto();
        instance.setQuantidade(Quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConcentracao method, of class Produto.
     */
    @Test
    public void testGetConcentracao() {
        System.out.println("getConcentracao");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getConcentracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConcentracao method, of class Produto.
     */
    @Test
    public void testSetConcentracao() {
        System.out.println("setConcentracao");
        String Concentracao = "";
        Produto instance = new Produto();
        instance.setConcentracao(Concentracao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Produto.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Produto.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String Tipo = "";
        Produto instance = new Produto();
        instance.setTipo(Tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class Produto.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Produto instance = new Produto();
        List<Produto> expResult = null;
        List<Produto> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
