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

    private static ListaHabitacion listaHabitacion;

    public static ListaHabitacion getInstance() {
        if (listaHabitacion == null) {
            listaHabitacion = new ListaHabitacion();
        }
        return listaHabitacion;
    }

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
        Habitacion habitacionToRemove = null;
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == obj.getNumero()) {
                if (!habitacion.isOcupada()) {
                    habitacionToRemove = habitacion;
                    break;
                }
            }
        }
        if (habitacionToRemove != null) {
            habitaciones.remove(habitacionToRemove);
            return true;
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
