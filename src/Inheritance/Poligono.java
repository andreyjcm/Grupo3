/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author hecferme
 */
public abstract class Poligono extends FiguraGeometrica{

    protected double areaPoligono;
    protected double perimetroPoligono;    
    protected int cantidadLados = 0;
    
    protected double[] medidasLados;

    protected double SumarLados ()
    {
        double resultado = 0;
        for (int i = 0; i < getCantidadLados(); i++)
            resultado += getMedida (i);
        return (resultado);
    }
    @Override
    public double getPerimetro ()
    {
        return this.perimetroPoligono;
    }
    
    @Override
    public double getArea ()
    {
        return this.areaPoligono;
    }
    
    @Override
     public void setPerimetro ()
    {
        this.perimetroPoligono = SumarLados ();
    }
    
    // Cantidad de lados del polígono
    public int getCantidadLados ()
    {
        return this.cantidadLados;
    }
    
    protected void setCantidadLados (int cantidadLados)
    {
        if (cantidadLados > 2)
            this.cantidadLados = cantidadLados;
    }
    
    protected boolean validaMedidaDeLado (double medida)
    {
        return (medida > 0);
    }
    
    protected boolean validaIndiceDeLado (int indice)
    {
        return (0 <= indice && indice < getCantidadLados ());
    }
    
    protected void setMedida (double medida, int indice)
    {
        if (validaIndiceDeLado (indice) && 
                validaMedidaDeLado (medida))
            medidasLados [indice] = medida;
    }
    
    protected double getMedida (int indice)
    {
        double resultado = Double.POSITIVE_INFINITY;
        if (validaIndiceDeLado (indice))
            resultado = medidasLados [indice];
        return resultado;
    }
    
    protected void setMedidas (double [] medidas)
    {
        for (int i = 0; i < getCantidadLados (); i++)
        {
            setMedida(medidas [i], i);
        }
    }
    
    // obtener las medidas del polígono
    public double[] getMedidas ()
    {
        return this.medidasLados;
    }
    
    public void CrearPoligono (int cantidadLados, double [] medidas)
    {
        if (cantidadLados == medidas.length)
        {
            setCantidadLados (cantidadLados);
            setMedidas(medidas);
            setPerimetro();
            setArea();
        }
    }
}
