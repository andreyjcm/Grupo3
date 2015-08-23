/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Chapter6.MiMatematica;

/**
 *
 * @author laboratorio
 */
public class TestMiMatematica {
    
    public TestMiMatematica() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestMaximoDosNegativos() 
    {
        double primerNumero = -20;
        double segundoNumero = -40;
        double expectedResult = -20;
        double realResult = 0.0;
        
        // declaro la instancia de la clase a testear
        MiMatematica clase = new MiMatematica();
        // invoco al método que voy a testear
        realResult = clase.Maximo(primerNumero, segundoNumero);
        //compare el resultado obtenido con el deseado
        assertEquals(expectedResult, realResult, 0.01);
        
    }

    @Test
    public void TestMaximoTresPositivos() 
    {
        double primerNumero = 20;
        double segundoNumero = 40;
        double tercerNumero = 30;
        double expectedResult = 40;
        double realResult = 0.0;
        
        // declaro la instancia de la clase a testear
        MiMatematica clase = new MiMatematica();
        // invoco al método que voy a testear
        realResult = clase.Maximo(primerNumero, segundoNumero, tercerNumero);
        //compare el resultado obtenido con el deseado
        assertEquals(expectedResult, realResult, 0.01);
        
    }

    @Test
    public void TestMaximoArregloDeUnaPosicion() 
    {
        double [] arregloNumeros = {20};
        double expectedResult = 20;
        double realResult = 0.0;
        
        // declaro la instancia de la clase a testear
        MiMatematica clase = new MiMatematica();
        // invoco al método que voy a testear
        realResult = clase.Maximo(arregloNumeros);
        //compare el resultado obtenido con el deseado
        assertEquals(expectedResult, realResult, 0.01);
        
    }

@Test
public void TestMaximoArregloDeCincoPosiciones() 
    {
        double [] arregloNumeros = {20, 40, -5, -10, 0};
        double expectedResult = 40;
        double realResult = 0.0;
        
        // declaro la instancia de la clase a testear
        MiMatematica clase = new MiMatematica();
        // invoco al método que voy a testear
        realResult = clase.Maximo(arregloNumeros);
        //compare el resultado obtenido con el deseado
        assertEquals(expectedResult, realResult, 0.01);
        
    }

}
