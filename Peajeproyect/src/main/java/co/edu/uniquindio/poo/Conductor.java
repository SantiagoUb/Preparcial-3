package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Conductor extends Persona{

    private LinkedList<Vehiculo> listvehiculos;

    public Conductor(String nombre, String apellido, String identificacion, LocalDate fechaNacimiento) {
        super(nombre, apellido, identificacion, fechaNacimiento);
        listvehiculos = new LinkedList<>();
    }

    public LinkedList<Vehiculo> getListvehiculos() {
        return listvehiculos;
    }

    public void setListvehiculos(LinkedList<Vehiculo> listvehiculos) {
        this.listvehiculos = listvehiculos;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}
