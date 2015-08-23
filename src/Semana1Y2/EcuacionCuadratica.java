/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1Y2;

/**
 *
 * @author laboratorio
 */
public class EcuacionCuadratica {
    
    String[] ArrCeroAQuince = {"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO",
                             "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "ONCE",
                             "DOCE", "TRECE", "CATORCE", "QUINCE"};
    String [] ArrDiecis = {"NULO", "DIECI", "VEINT", "TREINTA", "CUARENTA", "CINCUENTA",
                            "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
    String [] ArrCentenas = {"CERO", "CIEN", "DOSCIENTOS", "TRESCIENTOS", 
                             "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", 
                             "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};
    
    String ConvertirMenoresOIgualesAQuince (int numero)
    {
        String resultado = "";
        if (numero <= 15)
        {
            resultado = ArrCeroAQuince [numero];
        }
        return resultado;
    }
    
    public boolean LeapYear (int year)
    {
        boolean result = false;
        
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
            result = true;
        
        return (result);
    }
    
    String ConvertirNumerosEntreDieciseisYDiecinueve (int numero)
    {
        String resultado = "DIECI";
        if (16 <= numero && numero <= 19)
        {
            resultado += ArrCeroAQuince [numero % 10];
        }
        return resultado;        
    }
    
    String ConvertirNumerosEntreVeinteYNoventaYNueve (int numero)
    {
        String resultado = "";
        if (20 <= numero && numero <= 99)
        {
            int cantidadDecenas = numero / 10;
            String nombreDecena = ArrDiecis [cantidadDecenas];
            int cantidadUnidad = numero % 10;
            if (cantidadDecenas == 2)
            {
                // verifique si es 20
                if (cantidadUnidad == 0)
                    resultado = nombreDecena + "E";
                else
                {
                    resultado = nombreDecena + "I" + ArrCeroAQuince [cantidadUnidad];
                }
            }
            else
            {
                resultado = nombreDecena;
                if (cantidadUnidad > 0)
                    resultado += " Y " + ArrCeroAQuince [cantidadUnidad];
            }
        }
        return resultado;        
    }    
    
    public String ConvertirNumerosALetras (int numero)
    {
        String result = "";
        if (numero <= 15)
            result = ConvertirMenoresOIgualesAQuince (numero);
        if (16 <= numero && numero <= 19)
            result = ConvertirNumerosEntreDieciseisYDiecinueve(numero);
        if (20 <= numero && numero <= 99)
            result = ConvertirNumerosEntreVeinteYNoventaYNueve(numero);        
        return (result);
    }
    
    
    
    public String HelloWorldCustom (String name )
    {
        String result = "Hello world";
        if (name.equals("Alice") || name.equals("Bob"))
        {
            result = result + " " + name;
        }
        return (result);
    }
    
    public int SumOfDigits(int number)
    {
        int result = 0;
        int contador = number;
        
        while(contador > 0 ){
            result += (contador % 10);
            contador /= 10; 
        }
     
        return result;
    }

    
    public boolean MultipleOfThree (int number)
    {
        boolean result = false;
        
        
        return result;
    }
    
    public boolean PrimeNumber (int number)
    {
        boolean result = true;
        int multiplo = 2;
        
        // pregunte si el número es par
        if (number % multiplo == 0)
            result = false;
        else
            // el número es impar.  proceda con la segunda optimización
        {
            multiplo = 3;
            // verifique si es divisible entre 3
            if (MultipleOfThree(number) == true)
                result = false;
            else
            {
                // itere hasta donde corresponda para buscar submúltiplos
                int limite = number / 2;
                while (result == true && multiplo <= limite)
                {
                    multiplo += 2;
                    // verifique si el número es divisible entre el valor actual
                    if (number % multiplo == 0 )
                        result = false;
                }
            }
            
        }
            
        
        return result;
    }

    
    
}
