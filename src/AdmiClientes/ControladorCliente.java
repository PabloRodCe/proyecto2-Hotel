/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiClientes;

import Excepciones.ReservasPendientesException;
import Interfaces.Controlador;
import Interfaces.Vista;




/**
 *
 * @author Isaac Sibaja
 */
public class ControladorCliente implements Controlador<Cliente> {
    private ListaClientes lista;
    private Vista vista;
    
    //isCompleted adaptadado para que los JTextField de la grafica no esten vacios
    //creando los get de los txt como txtId
    
//    public boolean isComplete() {
//        return !this.vista.getId.getText.equals("") && !this.vista.getNombre.getText.equals("") && !this.vista.getText.getCorreo.equals("");
//    }

    public ControladorCliente(Vista vista) {
        lista = ListaClientes.getInstance();
        this.vista = vista;
    }

    @Override
    public void insert(Cliente cliente) {
        if (cliente.isComplete()) {
            lista.insert(cliente);
            this.readAll();
        } else {
            vista.displayErrorMessage("faltan datos, no se pudo agregar el cliente.");
        }
    }

    @Override
    public void update(Cliente cliente) {
        if (cliente.isComplete()) {
            lista.update(cliente);
            this.readAll();
        } else {
            vista.displayErrorMessage("no se puede actualizar el cliente. Faltan datos.");
        }
    }
    public void deleteCliente(Cliente cliente) throws ReservasPendientesException {
        if (lista.delete(cliente)) {
            System.out.println("eliminado");
        }else {
            throw new ReservasPendientesException("no se puede eliminar el cliente. Tiene reservas pendientes.");
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Cliente clienteEliminar = lista.search(cliente.getId());
        try {
            deleteCliente(clienteEliminar);
            this.readAll();
        } catch (ReservasPendientesException e){
           e.getMessage();
        }
    }

    @Override
    public void read(Object id) {
        Cliente cliente = lista.search(id);
        if (cliente != null) {
            vista.display(cliente);
        } else {
            vista.displayErrorMessage("No se encontro el cliente con la identificación proporcionada.");
        }
    }

    @Override
    public void readAll() {
        Cliente[] clientes = lista.toArray();
        if (clientes.length > 0) {
            vista.displayAll(clientes);
        }
    }
}
