/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TemaListas;

import java.util.Date;

/**
 *
 * @author laboratorio
 */
public class Frutas {

    public Frutas(String color, double pesoPromedio, String sabor, EnumFrutas nombre, Date fechaVencimiento) {
        this.color = color;
        this.pesoPromedio = pesoPromedio;
        this.sabor = sabor;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    String color;

    public String getColor() {
        return color;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public String getSabor() {
        return sabor;
    }

    public EnumFrutas getNombre() {
        return nombre;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    double pesoPromedio;
    String sabor;
    EnumFrutas nombre;
    Date fechaVencimiento;
}
