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
public abstract class Transporte {
    
    protected EnumEstado estado;

    protected void setEstado(EnumEstado estado) {
        this.estado = estado;
    }
    
    public void arrancar ()
            throws Exception
    {
        if (this.getEstado() == EnumEstado.APAGADO )
            this.setEstado(EnumEstado.ARRANCANDO);
        else
        {
            Exception ex = new Exception("El medio de transporte NO está en estado DETENIDO");
            throw ex;
        }
    }
    
    public void frenar ()
    {
        this.setEstado(EnumEstado.FRENANDO);
    }
    
    public void apagar ()
           throws Exception
    {
        if (this.getEstado() == EnumEstado.ARRANCANDO ||
                this.getEstado() == EnumEstado.FRENANDO )
            this.setEstado(EnumEstado.APAGADO);
        else
        {
            Exception ex = new Exception("El estado medio de transporte NO permite apagarlo.");
            throw ex;
        }
    }
 
    public EnumEstado getEstado() {
        return estado;
    }
    
    protected double distanciaRecorrida = 0;

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    
    public void Avanzar ()
            throws Exception
    {
        if (this.getEstado() != EnumEstado.APAGADO)
        {
            distanciaRecorrida += 1.0;
            this.setEstado(EnumEstado.AVANZANDO);
        }
        else
        {
            Exception ex = new Exception ("El estado del " +
                 "medio de transporte NO permite avanzar.");
            throw ex;
        }
    }
    
    protected int velocidadMaxima;

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0)
        {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }
    
    protected int cantidadRuedas;

    public void setCantidadRuedas(int cantidadRuedas) {
        if (cantidadRuedas > 0)
        {
            this.cantidadRuedas = cantidadRuedas;
        }
    }
    
    protected int pasajeros;

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    protected int alturaMaxima;

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }
    
    protected int alturaMinima;

    public int getPasajeros() {
        return pasajeros;
    }
    
            
}
