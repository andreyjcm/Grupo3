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
import Inheritance.*;

/**
 *
 * @author laboratorio
 */
public class TestTriangulo {
    
    public TestTriangulo() {
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
    public void TestTriangleFailure() {
        double lado1 = 3.0;
        double lado2 = 3.0;
        double lado3 = 10.0;
        String realMessage = "";
        String expectedMessage = "La medida del lado 1 y 2 " + 
                                 "NO deben exceder la medida del lado 3.";
        try
        {
            Inheritance.Triangulo miTriangulo = new Inheritance.Triangulo (lado1, lado2, lado3);
        }
        catch (Exception e)
        {
            realMessage = e.getMessage();
        }
        assertEquals("Excepción es diferente", expectedMessage, realMessage);
                
    }
    @Test
    public void TestTriangleHappyDay() {
        double lado1 = 3.0;
        double lado2 = 3.0;
        double lado3 = 3.0;
        String realMessage = "";
        String expectedMessage = "";
        try
        {
            Inheritance.Triangulo miTriangulo = new Inheritance.Triangulo (lado1, lado2, lado3);
        }
        catch (Exception e)
        {
            realMessage = e.getMessage();
        }
        assertEquals("Excepción es diferente", expectedMessage, realMessage);
                
    }
}
