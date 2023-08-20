/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiHabitaciones;

import Inter_Faces.List;
import java.util.ArrayList;

/**
 *
 * @author denze
 */
public class ListaHabitaciones implements List<Habitacion> {
    private static ListaHabitaciones listaHabitaciones = null;
    ArrayList<Habitacion> habitaciones = new ArrayList<>();

    private ListaHabitaciones() {
        this.habitaciones = new ArrayList<>();
    }

    public static ListaHabitaciones getInstance() {
        if (listaHabitaciones == null) {
        listaHabitaciones = new ListaHabitaciones();
        }
        return listaHabitaciones;
    }

    @Override
    public boolean agregar(Habitacion habitacion) {
        habitaciones.add(habitacion);
        return true;
        
    }
    
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    @Override
    public boolean eliminar(Habitacion obj) {
        
        return false;
        
    }

    @Override
    public Habitacion buscar(Object id) {
        
        return null;
        
    }

    @Override
    public boolean actualizar(Habitacion obj) {
        
        return false;
        
    }
}
