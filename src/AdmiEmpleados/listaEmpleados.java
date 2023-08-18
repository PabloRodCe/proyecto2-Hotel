/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiEmpleados;

import java.util.HashMap;

/**
 *
 * @author Pablo Rod
 */
public class listaEmpleados {
    HashMap<String, Empleados> empleados = new HashMap<>();
    private static listaEmpleados listaempleados;
     
    public static listaEmpleados getInstance() {
        if (listaempleados == null) {
        listaempleados = new listaEmpleados();
        }
        return listaempleados;
    }
    
}
