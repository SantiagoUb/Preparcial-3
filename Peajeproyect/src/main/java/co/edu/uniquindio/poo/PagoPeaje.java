package co.edu.uniquindio.poo;

import java.util.Date;

public class PagoPeaje {

    private Date hora;
    private String descripcion;

    public PagoPeaje(Date hora, String descripcion) {
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
