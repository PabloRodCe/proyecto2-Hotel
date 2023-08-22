/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiHabitaciones;

import Interfaces.Vista;
import java.util.ArrayList;
import Interfaces.Controlador;

/**
 *
 * @author denze
 */
public class ControladorHabitacion implements Controlador<Habitacion>{
    private ListaHabitacion lista;
    private Vista vista;

    public ControladorHabitacion(Vista vista) {
        lista = new ListaHabitacion();
        this.vista = vista;
    }

    @Override
    public void insert(Habitacion habitacion) {
        lista.insert(habitacion);
        this.readAll();
    }

    @Override
    public void update(Habitacion habitacion) {
        if (lista.update(habitacion)) {
            this.readAll();
        } else {
            vista.displayErrorMessaje("No se puede actualizar la habitación. Número de habitación no encontrado.");
        }
    }

    @Override
    public void delete(Habitacion habitacion) {
        try {
            if (lista.delete(habitacion)) {
                this.readAll();
            }
        } catch (RuntimeException e) {
            vista.displayErrorMessaje(e.getMessage());
        }
    }

    @Override
    public void read(Object numero) {
        Habitacion habitacion = lista.search(numero);
        if (habitacion != null) {
            vista.display(habitacion);
        } else {
            vista.displayErrorMessaje("No se encontró la habitación con el número proporcionado.");
        }
    }

    @Override
    public void readAll() {
        Habitacion[] habitaciones = lista.toArray();
        if (habitaciones.length > 0) {
            vista.displayAll(habitaciones);
        }
    }
}
