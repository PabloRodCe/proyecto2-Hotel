/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiServicios;

/**
 *
 * @author Pablo Rod
 */
public class Servicio {
     private static int contadorCodigos = 1;
    private int codigo;
    private String nombre;
    private double precio;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Servicio(String descripcion) {
        this.descripcion = descripcion;
    }

    public Servicio(String nombre, double costo) {
        this.codigo = contadorCodigos++;
        this.nombre = nombre;
        this.precio = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public static void setContadorCodigos(int contadorCodigos) {
        Servicio.contadorCodigos = contadorCodigos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String toString() {
        return "Código=" + codigo + ", Nombre=" + nombre + ", Precio=" + precio + ", Descripción=" + descripcion;
    }

    public boolean isComplete() {
        return !this.nombre.equals("") && this.precio > 0 && !this.descripcion.equals("");
    }

    public Object[] toArrayObject() {
        return new Object[]{this.codigo, this.nombre, this.precio, this.descripcion};
    }
}

