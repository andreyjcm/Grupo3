/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TemaListas;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author laboratorio
 */
public class Verduleria {
    // lista de todas las frutas que tiene la verdulería
    ArrayList<Frutas> sandias = new ArrayList ();
    ArrayList<Frutas> manzanas = new ArrayList ();
    ArrayList<Frutas> uvas = new ArrayList ();
    
    public int CantidadFrutasParaVender (EnumFrutas fruta)
    {
        int resultado = 0;
        switch (fruta)
        {
            // agréguela dentro de las sandías
            case SANDIAS: resultado = sandias.size();
                break;
            // agréguela dentro de las uvas
            case UVAS: resultado = uvas.size();
                break;
            // agréguela dentro de las manzanas
            case MANZANAS: resultado = manzanas.size();
                break;
        }
        return resultado;
    }
    
    // incluye una fruta ya lista dentro del inventario que corresponde
    void IncluirFrutaEnLista (Frutas fruta)
    {
        switch (fruta.getNombre())
        {
            // agréguela dentro de las sandías
            case SANDIAS: sandias.add(fruta);
                break;
            // agréguela dentro de las uvas
            case UVAS: uvas.add(fruta);
                break;
            // agréguela dentro de las manzanas
            case MANZANAS: manzanas.add(fruta);
                break;
        }
    }
    
    // cree una cantidad determinada de frutas, según los parámetros recibidos
    void AgregarFruta (EnumFrutas tipoFruta, double pesoPromedioFruta,
                              int cantidad, String color, String sabor)
    {
        int contador = 1;
        // realice el siguiente ciclo
        while (contador <= cantidad)
        {
            // fecha de hoy
            Date fechaVencimiento = new Date();
            // cree un peso aleatorio
            double pesoFruta = pesoPromedioFruta * Math.random();
            // cree una nueva fruta
            Frutas fruta = new Frutas(color, pesoFruta, sabor, 
                    tipoFruta, fechaVencimiento);
            // agréguela a la lista
            IncluirFrutaEnLista(fruta);
            // incremente el contador
            contador++;
        }    
    }
    
    public void AgregarSandias (int cantidad)
    {
        int contador = 1;
        // realice el siguiente ciclo
        while (contador <= cantidad)
        {
            // invoque al método que sabe agregar cualquier fruta
            AgregarFruta(EnumFrutas.SANDIAS, 20.0, cantidad, "Verde", "Dulce");
            // incremente el contador
            contador++;
        }
    }
    
    public void AgregarManzanas (int cantidad)
    {
        int contador = 1;
        // realice el siguiente ciclo
        while (contador <= cantidad)
        {
            // invoque al método que sabe agregar cualquier fruta
            AgregarFruta(EnumFrutas.MANZANAS, 1.2, cantidad, "Roja", "Dulce");
            // incremente el contador
            contador++;
        }
    }
    
    public void AgregarUvas (int cantidad)
    {
        int contador = 1;
        // realice el siguiente ciclo
        while (contador <= cantidad)
        {
            // invoque al método que sabe agregar cualquier fruta
            AgregarFruta(EnumFrutas.UVAS, 5.0, cantidad, "Morada", "Ácida");
            // incremente el contador
            contador++;
        }
    }
    
    Frutas VenderFruta (EnumFrutas tipoFruta)
    {
        // variable con la fruta que voy a vender
        Frutas frutaVendida = null;
        // determine el tipo de lista de donde debe sacar la fruta
        switch (tipoFruta)
        {
            case SANDIAS: 
                // si tengo sandías para vender
                if (sandias.size() > 0)
                {
                    // quite la sandía del inventario y véndala
                    frutaVendida = sandias.remove(0);
                }
                break;
            case UVAS: 
                // si tengo uvas para vender
                if (uvas.size() > 0)
                {
                    // quite la uva del inventario y véndala
                    frutaVendida = uvas.remove(0);
                }
                break;
            case MANZANAS: 
                // si tengo manzanas para vender
                if (manzanas.size() > 0)
                {
                    // quite la manzana del inventario y véndala
                    frutaVendida = manzanas.remove(0);
                }
                break;
        }
        // retorne la fruta vendida
        return frutaVendida;
    }
    
    public Frutas VenderSandia ()
    {
        // variable con la sandía que voy a vender
        Frutas sandia = null;
        // invoque al método que sabe vender frutas
        sandia = VenderFruta(EnumFrutas.SANDIAS);        
        // retorne la sandía vendida
        return sandia;
    }
    
    public Frutas VenderUva ()
    {
        // variable con la uva que voy a vender
        Frutas uva = null;
        // invoque al método que sabe vender frutas
        uva = VenderFruta(EnumFrutas.UVAS);        
        // retorne la sandía vendida
        return uva;
    }
    public Frutas VenderManzana ()
    {
        // variable con la sandía que voy a vender
        Frutas manzana = null;
        // invoque al método que sabe vender frutas
        manzana = VenderFruta(EnumFrutas.MANZANAS);        
        // retorne la sandía vendida
        return manzana;
    }
}
