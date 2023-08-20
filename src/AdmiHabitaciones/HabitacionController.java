/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiHabitaciones;

import java.util.ArrayList;

/**
 *
 * @author denze
 */
public class HabitacionController {

    private ListaHabitaciones listaHabitaciones;

    public HabitacionController() {
        listaHabitaciones = ListaHabitaciones.getInstance();
    }

    public void agregar(int numeroHabitacion, TipoHabitacion tipo) {
        Habitacion habitacion = new Habitacion(numeroHabitacion, tipo);
        listaHabitaciones.agregar(habitacion);
    }

    public void actualizar(int numeroHabitacion, TipoHabitacion nuevoTipo) {
        ArrayList<Habitacion> habitaciones = listaHabitaciones.getHabitaciones();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                habitacion.setTipo(nuevoTipo);
                break;
            }
        }
    }

    public void eliminar(int numeroHabitacion) throws Exception {
        ArrayList<Habitacion> habitaciones = listaHabitaciones.getHabitaciones();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                if (habitacion.isOcupada()) {
                    throw new Exception("No se puede eliminar una habitación ocupada.");
                } else {
                    habitaciones.remove(habitacion);
                    break;
                }
            }
        }
    }

    public Habitacion buscar(int numeroHabitacion) {
        ArrayList<Habitacion> habitaciones = listaHabitaciones.getHabitaciones();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null;
    }
}
