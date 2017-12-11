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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
     * Test of getId method, of class Funcionario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Funcionario instance = new Funcionario();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Funcionario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Funcionario instance = new Funcionario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Funcionario instance = new Funcionario();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeUsuario method, of class Funcionario.
     */
    @Test
    public void testGetNomeUsuario() {
        System.out.println("getNomeUsuario");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getNomeUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeUsuario method, of class Funcionario.
     */
    @Test
    public void testSetNomeUsuario() {
        System.out.println("setNomeUsuario");
        String NomeUsuario = "";
        Funcionario instance = new Funcionario();
        instance.setNomeUsuario(NomeUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Funcionario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Funcionario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String Senha = "";
        Funcionario instance = new Funcionario();
        instance.setSenha(Senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Funcionario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Funcionario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Funcionario instance = new Funcionario();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcrf method, of class Funcionario.
     */
    @Test
    public void testGetcrf() {
        System.out.println("getcrf");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getcrf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcrf method, of class Funcionario.
     */
    @Test
    public void testSetcrf() {
        System.out.println("setcrf");
        String crf = "";
        Funcionario instance = new Funcionario();
        instance.setcrf(crf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpermissao method, of class Funcionario.
     */
    @Test
    public void testSetpermissao() {
        System.out.println("setpermissao");
        String Permissao = "";
        Funcionario instance = new Funcionario();
        instance.setpermissao(Permissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPermissao method, of class Funcionario.
     */
    @Test
    public void testGetPermissao() {
        System.out.println("getPermissao");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getPermissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class Funcionario.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Funcionario instance = new Funcionario();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
