/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Semana1Y2.EcuacionCuadratica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecferme
 */
public class TestCuadratica {
    
    public TestCuadratica() {
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

    @Test
    public void pruebaHelloWorldCustomCasoBase ()
    {
        String userName = "Alejandra";
        String expectedMessage = "Hello WORLD";
        EcuacionCuadratica ecu = new EcuacionCuadratica();
        // realice la ejecución de la prueba
        String realMessage = ecu.HelloWorldCustom(userName);
        assertEquals(String.format("Error en la prueba.  Se esperaba " +
                "[%1s] y se obtuvo [%2s]", expectedMessage, realMessage), 
                expectedMessage.toUpperCase(), realMessage.toUpperCase());        
    }
    
    @Test
    public void pruebaHelloWorldBob ()
    {
        String userName = "Bob";
        String expectedMessage = "Hello WORLD Bob";
        EcuacionCuadratica ecu = new EcuacionCuadratica();
        // realice la ejecución de la prueba
        String realMessage = ecu.HelloWorldCustom(userName);
        assertEquals(String.format("Error en la prueba.  Se esperaba " +
                "[%1s] y se obtuvo [%2s]", expectedMessage, realMessage), 
                expectedMessage.toUpperCase(), realMessage.toUpperCase());        
    }

    @Test
    public void pruebaHelloWorldAlice ()
    {
        String userName = "Alice";
        String expectedMessage = "Hello WORLD Alice";
        EcuacionCuadratica ecu = new EcuacionCuadratica();
        // realice la ejecución de la prueba
        String realMessage = ecu.HelloWorldCustom(userName);
        assertEquals(String.format("Error en la prueba.  Se esperaba " +
                "[%1s] y se obtuvo [%2s]", expectedMessage, realMessage), 
                expectedMessage.toUpperCase(), realMessage.toUpperCase());        
    }

@Test
public void ConvertirNumerosALetrasCero ()
{
    int numeroAConvertir = 0;
    String expectedString = "CERO";
    String realString = "";
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realString = ecu.ConvertirNumerosALetras(numeroAConvertir);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedString, realString), 
            expectedString.toUpperCase(), realString.toUpperCase());        
}
   @Test
public void ConvertirNumerosALetrasDiecis ()
{
    int numeroAConvertir = 17;
    String expectedString = "DIECISIETE";
    String realString = "";
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realString = ecu.ConvertirNumerosALetras(numeroAConvertir);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedString, realString), 
            expectedString.toUpperCase(), realString.toUpperCase());        
} 

   @Test
public void ConvertirNumerosALetrasVeinte ()
{
    int numeroAConvertir = 20;
    String expectedString = "VEINTE";
    String realString = "";
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realString = ecu.ConvertirNumerosALetras(numeroAConvertir);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedString, realString), 
            expectedString.toUpperCase(), realString.toUpperCase());        
} 

   @Test
public void ConvertirNumerosALetrasVeintis ()
{
    int numeroAConvertir = 21;
    String expectedString = "VEINTIUNO";
    String realString = "";
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realString = ecu.ConvertirNumerosALetras(numeroAConvertir);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedString, realString), 
            expectedString.toUpperCase(), realString.toUpperCase());        
} 

   @Test
public void ConvertirNumerosALetrasDecenaExactaMayorAVeinte ()
{
    int numeroAConvertir = 50;
    String expectedString = "CINCUENTA";
    String realString = "";
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realString = ecu.ConvertirNumerosALetras(numeroAConvertir);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedString, realString), 
            expectedString.toUpperCase(), realString.toUpperCase());        
} 

   @Test
public void ConvertirNumerosALetrasDecenaNoExactaMayorAVeinte ()
{
    int numeroAConvertir = 99;
    String expectedString = "NOVENTA Y NUEVE";
    String realString = "";
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realString = ecu.ConvertirNumerosALetras(numeroAConvertir);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedString, realString), 
            expectedString.toUpperCase(), realString.toUpperCase());        
} 


    @Test
public void TestLeapYearOdd ()
{
    int myTestYear = 2013;
    boolean expectedResult = false;
    boolean realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.LeapYear(myTestYear);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}

@Test
public void TestLeapYearEvenNotMultipleOfFour ()
{
    int myTestYear = 2014;
    boolean expectedResult = false;
    boolean realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.LeapYear(myTestYear);
    assertEquals (expectedResult, realResult);
    /*
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "%1s y se obtuvo %2s a las %3s, desde la IP %4s, por el usuario %5s", 
            expectedResult, realResult, 
            "01/01/2010", "127.0.0.1", "fernandezmh" ), 
            expectedResult, realResult);        
            */
}

@Test
public void TestLeapYearEvenMultipleOfFourNotDividedFourHundred ()
{
    int myTestYear = 1700;
    boolean expectedResult = false;
    boolean realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.LeapYear(myTestYear);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}



@Test
public void TestPrimeEvenNumber ()
{
    int myTestNumber = 2000000;
    boolean expectedResult = false;
    boolean realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.PrimeNumber(myTestNumber);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}

@Test
public void TestPrimeNumberFive ()
{
    int myTestNumber = 5;
    boolean expectedResult = true;
    boolean realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.PrimeNumber(myTestNumber);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}

@Test
public void TestNotPrimeHighNumber ()
{
    int myTestNumber = 10201; // 10201 = 101 * 101
    boolean expectedResult = false;
    boolean realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.PrimeNumber(myTestNumber);
    assertEquals(String.format("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}

@Test
public void TestSumOfDigitsOneDigitNumber()
{
    int myTestNumber = 0; 
    int expectedResult = 0;
    int realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.SumOfDigits(myTestNumber);
    assertEquals (String.format ("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}


@Test
public void TestSumOfDigitsNumberFive()
{
    int myTestNumber = 5; 
    int expectedResult = 5;
    int realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.SumOfDigits(myTestNumber);
    assertEquals (String.format ("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}

@Test
public void TestSumOfDigitsNumberNinetyNine()
{
    int myTestNumber = 99; 
    int expectedResult = 18;
    int realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.SumOfDigits(myTestNumber);
    assertEquals (String.format ("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}


@Test
public void TestSumOfDigitsLargeNumber()
{
    int myTestNumber = 9999999; 
    int expectedResult = 63;
    int realResult;
    EcuacionCuadratica ecu = new EcuacionCuadratica();
    // realice la ejecución de la prueba
    realResult = ecu.SumOfDigits(myTestNumber);
    assertEquals (String.format ("Error en la prueba.  Se esperaba " +
            "[%1s] y se obtuvo [%2s]", expectedResult, realResult), 
            expectedResult, realResult);        
}
}
