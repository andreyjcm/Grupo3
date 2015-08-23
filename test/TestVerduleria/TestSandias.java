/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestVerduleria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import TemaListas.*;
import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class TestSandias {
    
    public TestSandias() {
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
    public void Comprar40Sandias() {
        // cantidad esperada de sandías
        int expectedQuantity = 40;
        // cantidad real de sandías
        int realQuantity = 0;

        // cree una nueva verdulería
        Verduleria verduleria = new Verduleria();
        // ingrese las sandías para la venta
        verduleria.AgregarSandias(40);
        // determine cuántas sandías hay para vender
        realQuantity = verduleria.CantidadFrutasParaVender(EnumFrutas.SANDIAS);
        // verifique si se cumple la condición de la prueba
         assertTrue(expectedQuantity == realQuantity);
    }
    
    @Test
    public void Comprar40SandiasYVender1() {
        // cantidad inicial de sandías
        int initialQuantity = 40;
        // cantidad esperada de sandías
        int expectedQuantity = 39;
        // cantidad real de sandías
        int realQuantity = 0;

        // cree una nueva verdulería
        Verduleria verduleria = new Verduleria();
        // ingrese las sandías para la venta
        verduleria.AgregarSandias(initialQuantity);
        // sandía que va a venderse
        Frutas sandiaVendida = null;
        // simula la venta de una sandía
        sandiaVendida = verduleria.VenderSandia();
        // determine cuántas sandías hay para vender
        realQuantity = verduleria.CantidadFrutasParaVender(EnumFrutas.SANDIAS);
        
        // verifique si se cumple la condición de la prueba
         assertTrue(expectedQuantity == realQuantity);
    }
}
