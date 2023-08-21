/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdmiClientes;

import Excepciones.ReservasPendientesException;
import java.time.LocalDate;
import java.time.Period;

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

    public Cliente(int Id, String Nombre, int FechaNacimiento, String Telefono, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
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

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
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

}
