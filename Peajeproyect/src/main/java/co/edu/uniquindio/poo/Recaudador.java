package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Recaudador extends  Persona{

    private double sueldo;

    public Recaudador(double sueldo, String nombre, String apellido, String identificacion, LocalDate fechaNacimiento) {
        super(nombre, apellido, identificacion, fechaNacimiento);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
