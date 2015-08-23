/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePart2;

/**
 *
 * @author laboratorio
 */
public class Avion extends Transporte{

    private int alturaActual ;

    public int getAlturaActual() {
        return alturaActual;
    }
    
    public Avion(int velocidadMaxima)
            throws Exception
    {
        super.setEstado(EnumEstado.APAGADO);
        super.setVelocidadMaxima(velocidadMaxima);
        super.setCantidadRuedas(5);
        super.setPasajeros(2);
        super.setAlturaMinima(0);
        super.setAlturaMaxima(20000);
        this.setAlturaActual(0);
   }
    
    public void setAlturaActual (int alturaActual)
            throws Exception
    {
        if (super.getAlturaMinima() <= alturaActual
            && alturaActual <= super.getAlturaMaxima())
        {
            this.alturaActual = alturaActual;
        }
        else
        {
            Exception ex = new Exception ("Altura inválida");
        }
    }
            
    
}
