/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestiónReservas;

import AdmiClientes.Cliente;
import AdmiHabitaciones.Habitacion;
import Interfaces.Entidad;
import java.time.LocalDate;

/**
 *
 * @author Pablo Rod
 */
public class Reservas implements Entidad {

    private int numeroReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private String estado;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reservas(int numeroReserva, Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.numeroReserva = numeroReserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.estado = "Pendiente";
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        habitacion.setOcupada(true);
        cliente.marcarReservasPendientes();
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean existeCliente(int id, Cliente cliente) {
        if (cliente.getId() == id) {
            return true;
        }
        return false;
    }

    public boolean restringirHabitacion(Habitacion hab) {
        if (hab.isOcupada()) {
            return false;
        }
        return true;
    }

    public void estadia() {
    }

    public int montoTotal() {
        int monto = 0;
        monto = (int) (getHabitacion().getPrecio() + ((getHabitacion().getPrecio() * 0.13) / 100));
        return monto;
    }

    public void activar() {
        if (getEstado().equals("Pendiente")) {
            setEstado("En ejecución");
            this.habitacion.setOcupada(false);
        }
    }

    public void finalizar() {
        if (getEstado().equals("En ejecución")) {
            setEstado("Finalizada");
            this.habitacion.setOcupada(false);
        }
    }

    public void cancelar() {
        if (getEstado().equals("Pendiente")) {
            setEstado("“Cancelada");
        }
    }

    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] toArrayObject() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
