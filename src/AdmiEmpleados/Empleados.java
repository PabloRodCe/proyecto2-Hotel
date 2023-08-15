/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiEmpleados;

/**
 *
 * @author Pablo Rod
 */
public class Empleados {
    private String nombre;
    private String telefono;
    private String id;
    private double sueldo;
    private String puesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Empleados(String nombre, String telefono, String id, double sueldo, String puesto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public Empleados(String nombre, String id, double sueldo, String puesto, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.telefono= "";
    }

    
    
}
