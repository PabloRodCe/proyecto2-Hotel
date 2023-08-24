/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiClientes;

import Excepciones.ReservasPendientesException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Pablo Rod
 */
public class Cliente {

    private int Id;
    private String Nombre;
    private LocalDate FechaNacimiento;
    private String Telefono;
    private String Correo;
    private int Edad;
    private boolean tieneReservasPendientes;

    public Cliente(int Id, String Nombre, String FechaNacimiento, String Telefono, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
        setFechaNacimiento(FechaNacimiento);
        this.tieneReservasPendientes = false;
    }

    public Cliente(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNacimiento() {
        
        
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        this.FechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
    }

    public int getEdad() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(FechaNacimiento, currentDate);
        return period.getYears();
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public boolean tieneReservasPendientes() {
        return tieneReservasPendientes;
    }

    public void marcarReservasPendientes() {
        tieneReservasPendientes = true;
    }

    public void eliminarCliente() throws ReservasPendientesException {
        if (tieneReservasPendientes) {
            throw new ArithmeticException("reserva pendientes");
        }
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    @Override
    public String toString() {
        return "Identificación=" + Id + ", Nombre=" + Nombre + ", Fecha de Nacimiento=" + ", Teléfono=" + Telefono + ", Correo=" + Correo;
    }
    public boolean isComplete() {
        return this.Id > 0 && !this.Nombre.equals("") && !this.Correo.equals("");
    }
    public Object[] toArrayObject() {
    return new Object[]{this.Id, this.Nombre, this.Telefono, this.Correo};
}



}
