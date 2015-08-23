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
class Canton {

    public Canton(Integer numero, Integer provincia, String nombre, double area, String iniciales) {
        this.setNumero(numero);
        this.setProvincia(provincia);
        this.setNombre(nombre);
        this.setArea(area);
        this.setIniciales(iniciales);
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setProvincia(Integer provincia) {
        this.provincia = provincia;
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
    private Integer numero;
    private Integer provincia;

    public Integer getNumero() {
        return numero;
    }

    public Integer getProvincia() {
        return provincia;
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
