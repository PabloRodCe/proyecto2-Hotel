/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiEmpleados;

import Interfaces.Controlador;
import Interfaces.Vista;
import java.util.Iterator;

/**
 *
 * @author Pablo Rod
 */
public class EmpleadosController implements Controlador<Empleados> {

    private listaEmpleados lista;    
    private Vista vista;   
    

    public EmpleadosController(Vista vista) {
        lista = listaEmpleados.getInstance();
        this.vista = vista;
    }
    
    
    
    @Override
    public void insert(Empleados empleado) {
        if (empleado.isComplete()) {
            lista.insert(empleado);
            this.readAll();
        } else {
            vista.displayErrorMessage("Faltan datos, No se pudo agregar el empleado .");
        }
    }
    
    @Override
    public void update(Empleados empleado) {
        if (empleado.getId() != null) {
            // Obtén la identificación del empleado que deseas actualizar
            String identificacion = empleado.getId();

            // Busca al empleado en la lista
            Iterator<String> claves = lista.getEmpleados().keySet().iterator();
            while (claves.hasNext()) {                
                String clave = claves.next();
                if (identificacion.equals(lista.search(clave).getId())) {
                    // Actualiza el nombre, teléfono y puesto del empleado existente con los nuevos valores
                    lista.search(clave).setNombre(empleado.getNombre());
                    lista.search(clave).setTelefono(empleado.getTelefono());
                    lista.search(clave).setPuesto(empleado.getPuesto());

                    // Actualiza la lista o el almacenamiento de empleados
                    lista.update(lista.search(clave));
                    this.readAll();
                    return; // Termina la iteración, ya se actualizó el empleado.
                }
            }
//            
//            for (Empleados empleadoExistente : lista.getEmpleados().k) {
//                if (identificacion.equals(empleadoExistente.getId())) {
//                    // Actualiza el nombre, teléfono y puesto del empleado existente con los nuevos valores
//                    empleadoExistente.setNombre(empleado.getNombre());
//                    empleadoExistente.setTelefono(empleado.getTelefono());
//                    empleadoExistente.setPuesto(empleado.getPuesto());
//
//                    // Actualiza la lista o el almacenamiento de empleados
//                    lista.update(empleadoExistente);
//                    this.readAll();
//                    return; // Termina la iteración, ya se actualizó el empleado.
//                }
//            }

            // Si no se encontró al empleado
            vista.displayErrorMessage("No se puede actualizar empleado. El empleado  no existe.");
        } else {
            vista.displayErrorMessage("No se puede actualizar el empleado. Faltan datos.");
        }
    }
    
    @Override
    public void delete(Empleados empleado) {
        if (lista.delete(empleado)) {
            this.readAll();
        } else {
            vista.displayErrorMessage("No se puede eliminar el empleado. No se encontró en la lista.");
            
        }
    }
    
   

    
    @Override
    public void read(Object id) {
        Empleados empleado = lista.search(id);
        if (empleado != null) {
            
            vista.display(empleado);
        } else {
            vista.displayErrorMessage("No se encontró el empleado con el ID proporcionado.");
        }
    }
    
    @Override
    public void readAll() {
        Empleados[] empleados = lista.toArray();
        if (empleados.length > 0) {
            vista.displayAll(empleados);
        }
    }
    
}
