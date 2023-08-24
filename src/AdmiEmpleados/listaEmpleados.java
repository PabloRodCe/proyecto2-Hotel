/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiEmpleados;

import Interfaces.Lista;
import java.util.HashMap;

/**
 *
 * @author Pablo Rod
 */
public class listaEmpleados implements Lista<Empleados> {

    HashMap<String, Empleados> empleados = new HashMap<>();
    private static listaEmpleados listaempleados;

    public listaEmpleados() {
        this.empleados = new HashMap<>();
    }

    public static listaEmpleados getInstance() {
        if (listaempleados == null) {
            listaempleados = new listaEmpleados();
        }
        return listaempleados;
    }

    public HashMap<String, Empleados> getEmpleados() {
        return empleados;
    }

    @Override
    public boolean insert(Empleados obj) {
        if (empleados.containsKey(obj.getId())) {
            return false; // Ya existe un empleado con ese id
        }
        // Agregar el nuevo 
        empleados.put(obj.getId(), obj);
        return true;
    }

    @Override
    public boolean update(Empleados obj) {

        String id = obj.getId(); // Obtener la identificación del objeto "obj"
        if (empleados.containsKey(id)) {
            // Obtener el empleado existente
            Empleados empleadoExistente = empleados.get(id);

            // Actualizar los datos del empleado existente con los nuevos valores
            empleadoExistente.setNombre(obj.getNombre());
            empleadoExistente.setTelefono(obj.getTelefono());
            empleadoExistente.setPuesto(obj.getPuesto());

            return true; // Empleado actualizado con éxito.
        }
        return false;

    }

    @Override
    public boolean delete(Empleados obj) {
        if (empleados.containsKey(obj.getId())) {
            empleados.remove(obj.getId());
            return true; // Empleado eliminado con éxito.
        }
        return false;
    }

    @Override
    public Empleados search(Object id) {
        return empleados.get(id);
    }

    @Override
    public Empleados[] toArray() {
        return empleados.values().toArray(new Empleados[0]);
    }

}
