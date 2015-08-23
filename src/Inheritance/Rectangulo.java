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
public class Rectangulo extends Poligono {
    
    private final int cantidadLadosRectangulo = 4;
    
    private void CrearRectangulo (double [] Lados)
    {
        super.CrearPoligono(cantidadLadosRectangulo, Lados);
        setArea();
   }
    
    public Rectangulo (double largo, double ancho)
    {
        AsignarValoresAlRectangulo (largo, ancho);
    }
    
    @Override
    public void setArea() {
        super.areaPoligono = super.getMedida(0) * super.getMedida(1);
    }

     private void AsignarValoresAlRectangulo (double largo, double ancho)
    {
        double[] medidas = {largo, ancho, largo, ancho};
        CrearRectangulo(medidas);        
        // ToDo:  caso de error cuando el triángulo no es válido
    }
    
   
  
    
}
