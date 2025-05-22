package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class PuestoControl {

    private String nombre;
    private String departamento;
    private double valorTotal;
    private LinkedList<Vehiculo> listaVehiculos;

    public PuestoControl(String nombre, String departamento, double valorTotal) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.valorTotal = valorTotal;
        listaVehiculos = new LinkedList<>();
    }

    //Calcular el valor del peaje de un vehículo X, actualiza el valor total recaudado
    public void actualizarValorTotal(Vehiculo vehiculoIndex) {
        double valorPeajeVehiculo = vehiculoIndex.calcularValorTarifa();
        this.valorTotal += valorPeajeVehiculo;
    }

    //Consultar el total de dinero pagado en peajes por cada vehículo que una persona tiene asignado
    public String consultarValorTotal(Conductor conductorIndex) {
        String resultado = "";
        double valorPagado = 0;
        LinkedList<Vehiculo> listaVehiculosAux = conductorIndex.getListvehiculos();
        for (Vehiculo vehiculo : listaVehiculosAux) {
            valorPagado += vehiculo.calcularValorTarifa();
        }
        resultado += "para el conductor " + conductorIndex.getNombre() + " el valor total pagado de sus vehiculos es " + valorPagado;
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LinkedList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}
