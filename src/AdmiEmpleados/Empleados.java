/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiEmpleados;

/**
 *
 * @author Pablo Rod
 */
public class Empleados {
    private String nombre;
    private String telefono;
    private String id;
    private int sueldo;
    private String puesto;
    private EnunPuesto enunpuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public EnunPuesto getEnunpuesto() {
        return enunpuesto;
    }

    public void setEnunpuesto(EnunPuesto enunpuesto) {
        this.enunpuesto = enunpuesto;
    }
    
    public int sueldo(){
        int sueldo = 0;
        
        if (getEnunpuesto() == enunpuesto.Gerente) {
             setSueldo(1400000);
        }else if (getEnunpuesto() == enunpuesto.Conserje) {
            setSueldo(550000);
        }
        else if (getEnunpuesto() == enunpuesto.Recepcionista) {
            setSueldo(800000);
        }
        else if (getEnunpuesto() == enunpuesto.Supervisor) {
            setSueldo(1100000);
        }
        else if (getEnunpuesto() == enunpuesto.Mantenimiento) {
            setSueldo(650000);
        }
        sueldo = getSueldo();
        return sueldo;
    }
    

    public Empleados(String nombre, String telefono, String id, EnunPuesto enunpuesto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
        this.puesto = enunpuesto.toString();
        setEnunpuesto(enunpuesto);
        this.sueldo = sueldo();
    }

//    public Empleados(String nombre, String id,  String puesto, EnunPuesto enunpuesto) {
//        this.nombre = nombre;
//        this.id = id;
//        this.sueldo = sueldo(getPuesto());
//        this.puesto = puesto;
//        this.telefono= "";
//        this.enunpuesto = enunpuesto;
//    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", telefono=" + telefono + ", id=" + id + ", sueldo=" + sueldo + ", puesto=" + puesto + ", enunpuesto=" + enunpuesto + '}';
    }

    public boolean isComplete() {
        return !this.id.equals("") && !this.nombre.equals("") &&!this.puesto.equals("")&&!this.telefono.equals("");
     }
     public Object[] toArrayObject() {
        return new Object[]{this.id,this.nombre,this.puesto,this.sueldo,this.telefono};
     }
}
