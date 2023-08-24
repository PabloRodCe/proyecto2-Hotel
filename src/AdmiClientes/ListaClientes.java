/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiClientes;


import java.util.ArrayList;
import Interfaces.Lista;

/**
 *
 * @author Isaac Sibaja
 */
public class ListaClientes implements Lista<Cliente>{

    private static ListaClientes listaClientes = null;
    ArrayList<Cliente> Clientes = new ArrayList<>();

    private ListaClientes() {
        this.Clientes = new ArrayList<>();
    }

    public static ListaClientes getInstance() {
        if (listaClientes == null) {
            listaClientes = new ListaClientes ();
        }
        return listaClientes;
    }

    @Override
    public boolean insert(Cliente cliente) {
        if (cliente != null && cliente.getId() > 0) {
            Clientes.add(cliente); 
            return true;
       
        }
        return false;
    }


    @Override
    public boolean update(Cliente obj) {
        for (int i = 0; i < Clientes.size(); i++) {
            if (Clientes.get(i).getId() == obj.getId()) {
                Clientes.set(i, obj);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean delete(Cliente obj) {
        if (obj != null && obj.getId() > 0) {
            if (!obj.tieneReservasPendientes()) {
                System.out.println("Eliminado en lista");
                Clientes.remove(obj);
                return true;
            }
        }
        return false;
    }


    @Override
    public Cliente search(Object id) {
        if (id instanceof Integer) {
            int clientId = (int) id;
            for (Cliente cliente : Clientes) {
                if (cliente.getId() == clientId) {
                    return cliente;
                }
            }
        }
        return null;
    }


    @Override
    public Cliente[] toArray() {
      return Clientes.toArray(new Cliente[0]);
    }
}
