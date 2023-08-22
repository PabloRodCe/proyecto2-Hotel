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
    public boolean insert(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente search(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
