/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiClientes;


import Inter_Faces.List;
import java.util.ArrayList;

/**
 *
 * @author Isaac Sibaja
 */
public class ListaClientes implements List<Cliente>{

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
    public boolean agregar(Cliente cliente) {
        
        Clientes.add(cliente);
        return true;
       
    }

    @Override
    public boolean eliminar(Cliente obj) {     
       throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
