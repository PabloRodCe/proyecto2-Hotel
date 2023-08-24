/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiHabitaciones;

import Interfaces.Vista;
import Interfaces.Controlador;
import Interfaces.Display;

/**
 *
 * @author denze
 */
public class ControladorHabitacion implements Controlador<Habitacion>{
    private ListaHabitacion lista;
    private Vista vista;
    private Display display;
    
    public ControladorHabitacion(Vista vista) {
        lista = ListaHabitacion.getInstance();
        this.vista = vista;
    }

    @Override
    public void insert(Habitacion habitacion) {
        if (habitacion.isComplete()) {
            lista.insert(habitacion);
            this.readAll();
        } else {
            vista.displayErrorMessage("Faltan datos, no se pudo agregar la habitación.");
        }
    }

    @Override
    public void update(Habitacion habitacion) {
        if (habitacion.isComplete()) {
            if (lista.update(habitacion)) {
                this.readAll();
            } else {
                vista.displayErrorMessage("No se puede actualizar la habitación. Número de habitación no encontrado.");
            }
        } else {
            vista.displayErrorMessage("No se puede actualizar la habitación. Número de habitación no encontrado.");
        }
    }

    @Override
    public void delete(Habitacion habitacion) {
        Habitacion habitacionEnLista = lista.search(habitacion.getNumero());
        if (habitacionEnLista != null) {
            if (!habitacionEnLista.isOcupada()) {
                lista.delete(habitacionEnLista);
                this.readAll();
            } else {
                throw new RuntimeException("No se puede eliminar la habitación, está ocupada.");
            }
        } else {
            vista.displayErrorMessage("No se encontró la habitación con el número proporcionado.");
        }
    }

    @Override
    public void read(Object numero) {
        Habitacion habitacion = lista.search(numero);
        if (habitacion != null) {
            vista.display(habitacion);
        } else {
            vista.displayErrorMessage("No se encontró la habitación con el número proporcionado.");
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
