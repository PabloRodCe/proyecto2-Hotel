/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiHabitaciones;

import java.util.ArrayList;
import Interfaces.Lista;

/**
 *
 * @author denze
 */
public class ListaHabitacion implements Lista<Habitacion> {
    private ArrayList<Habitacion> habitaciones;

    public ListaHabitacion() {
        habitaciones = new ArrayList<>();
    }

    @Override
    public boolean insert(Habitacion obj) {
        habitaciones.add(obj);
        return true;
    }

    @Override
    public boolean update(Habitacion obj) {
        // No se permite modificar ocupada, solo tipo
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == obj.getNumero()) {
                habitacion.setTipo(obj.getTipo());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Habitacion obj) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == obj.getNumero()) {
                if (!habitacion.isOcupada()) {
                    habitaciones.remove(habitacion);
                    return true;
                } else {
                    throw new RuntimeException("No se puede eliminar la habitación, está ocupada.");
                }
            }
        }
        return false;
    }

    @Override
    public Habitacion search(Object numero) {
        if (numero instanceof Integer) {
            int num = (int) numero;
            for (Habitacion habitacion : habitaciones) {
                if (habitacion.getNumero() == num) {
                    return habitacion;
                }
            }
        }
        return null;
    }

    @Override
    public Habitacion[] toArray() {
        return habitaciones.toArray(new Habitacion[0]);
    }
}
