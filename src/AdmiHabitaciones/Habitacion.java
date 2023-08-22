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
    private int numero;
    private TipoHabitacion tipo;
    private boolean ocupada;
    private double precio;

    public Habitacion(int numero, TipoHabitacion tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupada = false;
        this.precio = calcularPrecioSugerido(tipo);
    }

    public int getNumero() {
        return numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
        this.precio = calcularPrecioSugerido(tipo);
    }

    public void ocupar() {
        ocupada = true;
    }

    public void liberar() {
        ocupada = false;
    }

    private double calcularPrecioSugerido(TipoHabitacion tipo) {
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

    @Override
    public String toString() {
        return "Número=" + numero + ", Tipo=" + tipo + ", Ocupada=" + ocupada + ", Precio=" + precio;
    }
    
    public Object[] toArrayObject() {
        return new Object[]{getNumero(), getTipo(), isOcupada(), getPrecio()};
    }
}
