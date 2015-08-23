/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author hecferme
 */
public class Provincia {

    public Provincia(Integer numero, String nombre, double area, String iniciales) {
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setArea(area);
        this.setIniciales(iniciales);
    }
    private Integer numero;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public String getIniciales() {
        return iniciales;
    }
    private String nombre;
    private double area;
    private String iniciales;
}
