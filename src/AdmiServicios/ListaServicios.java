/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiServicios;

import Interfaces.Lista;
import java.util.ArrayList;

/**
 *
 * @author Isaac Sibaja
 */
public class ListaServicios implements Lista<Servicio> {

    private static ListaServicios listaServicios = null;
    ArrayList<Servicio> servicios = new ArrayList<>();

    private ListaServicios() {
        this.servicios = new ArrayList<>();
    }

    public static ListaServicios getInstance() {
        if (listaServicios == null) {
            listaServicios = new ListaServicios();
        }
        return listaServicios;
    }

    @Override
    public boolean insert(Servicio obj) {
        if (obj != null) {
            obj.setCodigo(servicios.size() + 1);
            servicios.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Servicio obj) {
        if (obj != null) {
            for (Servicio servicio : servicios) {
                if (servicio.getCodigo() == obj.getCodigo()) {
                    servicio.setDescripcion(obj.getDescripcion());
                    servicio.setPrecio(obj.getprecio());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(Servicio obj) {
        Servicio servicioToRemove = null;
        for (Servicio servicio : servicios) {
            if (servicio.getCodigo() == obj.getCodigo()) {
                servicioToRemove = servicio;
                break;
            }
        }
        if (servicioToRemove != null) {
                servicios.remove(servicioToRemove);
                return true;
            }
            return false;
        }
  @Override
    public Servicio search(Object id) {
    if (id instanceof Integer) {
        int codigo = (int) id;
        for (Servicio servicio : servicios) {
            if (servicio.getCodigo() == codigo) {
                return servicio;
            }
        }
    }
    return null;
    }
    @Override
    public Servicio[] toArray() {
        return servicios.toArray(new Servicio[0]);
    }

}
