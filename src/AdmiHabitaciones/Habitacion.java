/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiHabitaciones;

/**
 *
 * @author Pablo Rod
 */
public class Habitacion {
    private int numeroHabitacion;
    private TipoHabitacion tipo;
    private boolean ocupada;
    private double precio;

    public Habitacion(int numeroHabitacion, TipoHabitacion tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.ocupada = false;
        this.precio = calcularPrecioSugerido();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }
    
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    private double calcularPrecioSugerido() {
        switch (tipo) {
            case INDIVIDUAL:
                return 45000;
            case DOBLE:
                return 80000;
            case SUITE:
                return 140000;
            default:
                return 0;
        }
    }
}
