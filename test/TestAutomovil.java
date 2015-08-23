/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import InheritancePart2.Automovil;
import InheritancePart2.EnumEstado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laboratorio
 */
public class TestAutomovil {
    
    public TestAutomovil() {
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
    public void crearAutomovilHappyDay() {
        Automovil testAuto = new Automovil(100, 4);
        EnumEstado expectedEstado = EnumEstado.APAGADO;
        int expectedRuedas = 4;
        assertTrue("Estado inconsistente", 
                testAuto.getEstado() == expectedEstado);
        assertTrue("Cantidad errónea de ruedas", 
                testAuto.getCantidadRuedas() == expectedRuedas);
    }
    
    @Test
    public void crearAutomovilAvanzando()
            throws Exception{
        Automovil testAuto = new Automovil(100, 4);
        testAuto.arrancar();
        int expectedDistancia = 30;
        int cantidadAvances = expectedDistancia;
        String expectedMessage = "";
        String realMessage = "";
        try
        {
            for (int i = 0; i < cantidadAvances; i++)
            {
                testAuto.Avanzar();
            }        
        }
        catch (Exception e)
        {
            realMessage = e.getMessage();
        }
        assertTrue("Sucedió una excepción", 
                realMessage == expectedMessage);
        EnumEstado expectedEstado = EnumEstado.AVANZANDO;
        assertFalse("Estado inconsistente", 
                testAuto.getEstado() != expectedEstado);
        assertTrue("Distancia recorrida inválida", 
                testAuto.getDistanciaRecorrida() == expectedDistancia);
    }
}
