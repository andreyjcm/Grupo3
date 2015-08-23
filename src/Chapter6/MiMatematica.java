/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter6;

/**
 *
 * @author laboratorio
 */
public class MiMatematica {
    
    // devuelve el máximo de sus DOS parámetros double
    public double Maximo (double x, double y)
    {
        double result = 0.0;
        if (x < y)
            result = y;
        else
            result = x;
        return (result);
    }
    
    // devuelve el máximo de sus TRES parámetros double
    public double Maximo (double x, double y, double z)
    {
        double result = 0.0;
        result = Maximo (Maximo (x, y), z);
        return (result);
    }
    
      // devuelve el máximo de sus CUATRO parámetros double
    public double Maximo (double x, double y, double z, double w)
    {
        double result = 0.0;
        result = Maximo (Maximo (w, x, y), z);
        return (result);      
    }
    
    public double Maximo (double [] x)
    {
        double result = 0.0;
        int largo = x.length;
        /*
        if (largo == 1)
            result = x[0];
        if (largo == 2)
            result = Maximo (x[0], x[1]);
        if (largo > 2)
        {
                */
            for (int i = 0; i < largo; i++)
            {
                result = Maximo (result, x[i]);
            }
                
        //}
         
        return (result);
    }
  
}
