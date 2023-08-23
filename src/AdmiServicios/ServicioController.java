/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiServicios;

import Interfaces.Controlador;
import Interfaces.Vista;

/**
 *
 * @author Isaac Sibaja
 */
public class ServicioController implements Controlador<Servicio>{
    private ListaServicios lista;
    private Vista vista;
    
    public ServicioController(Vista vista) {
        lista = ListaServicios.getInstance();
        this.vista = vista;
    }

    public void insert(Servicio servicio) {
        if (servicio.isComplete()) {
            lista.insert(servicio);
            this.readAll();
        } else {
            vista.displayConfirmMessage("Faltan datos, No se pudo agregar el servicio.");
        }
    }

    public void update(Servicio servicio) {
        if (servicio.isComplete()) {
            lista.update(servicio);
            this.readAll();
        } else {
            vista.displayErrorMessage("No se puede actualizar el servicio. Faltan datos.");
        }
    }

    @Override
    public void delete(Servicio servicio) {
        if (lista.delete(servicio)) {
            this.readAll();
        } else {
            vista.displayErrorMessage("No se puede eliminar el servicio. No se encontró en la lista.");
        }
    }

    @Override
     public void read(Object codigo) {
        Servicio servicio = lista.search(codigo);
        if (servicio != null) {
            vista.display(servicio);
        } else {
            vista.displayErrorMessage("No se encontró el servicio con el código proporcionado.");
        }
    }
    

    @Override
    public void readAll() {
        Servicio[] servicios = lista.toArray();
        if (servicios.length > 0) {
            vista.displayAll(servicios);
        }
    }
}
