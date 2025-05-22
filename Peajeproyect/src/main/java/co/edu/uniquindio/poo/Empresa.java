package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private LinkedList<Conductor> listConductores;
    private LinkedList<Vehiculo> listVehiculos;
    private LinkedList<PagoPeaje> listPagoPeajes;
    private LinkedList<PuestoControl> listPuestosControl;
    private LinkedList<Recaudador> listRecaudadores;

    public Empresa(String nombre) {
        this.nombre = nombre;
        listConductores = new LinkedList<>();
        listVehiculos = new LinkedList<>();
        listPagoPeajes = new LinkedList<>();
        listPuestosControl = new LinkedList<>();
        listRecaudadores = new LinkedList<>();
    }

    //Obtener una lista de vehiculos por tipo de vehiculo
    public LinkedList<Vehiculo> obtenerVehiculosTipo(Vehiculo vehiculoVerificar) {
        LinkedList<Vehiculo> vehiculosPorTipo = new LinkedList<>();
        LinkedList<Vehiculo> vehiculosCarros = new LinkedList<>();
        LinkedList<Vehiculo> vehiculosMotos = new LinkedList<>();
        LinkedList<Vehiculo> vehiculosCamiones = new LinkedList<>();

        for (Vehiculo vehiculo : listVehiculos) {
            if(vehiculoVerificar.getClass() == Carro.class) {
                vehiculosCarros.add(vehiculo);
            }
            vehiculosPorTipo = vehiculosCarros;
        }

        for (Vehiculo vehiculo : listVehiculos) {
            if(vehiculoVerificar.getClass() == Moto.class) {
                vehiculosMotos.add(vehiculo);
            }
            vehiculosPorTipo = vehiculosMotos;
        }

        for (Vehiculo vehiculo : listVehiculos) {
            if(vehiculoVerificar.getClass() == Camion.class) {
                vehiculosCamiones.add(vehiculo);
            }
            vehiculosPorTipo = vehiculosCamiones;
        }
        return vehiculosPorTipo;
    }

    //asignar un vehiculo a un conductor
    public boolean asignarVehiculo(String placaVehiculo, String idConductor){
        boolean asignar = false;
        Vehiculo newVehiculo = null;
        Conductor newConductor = null;

        for (Vehiculo vehiculo : listVehiculos) {
            if(vehiculo.getPlaca().equals(placaVehiculo)) {
                newVehiculo = vehiculo;
            }
        }

        for(Conductor conductor : listConductores) {
            if(conductor.getIdentificacion().equals(idConductor)) {
                newConductor = conductor;
            }
        }
        if(newConductor != null && newVehiculo != null) {
            newConductor.getListvehiculos().add(newVehiculo);
        }
        return asignar;
    }

    //obtener conductores que tienen al menos un camion asignado con una capacidad mayor a 10
    public LinkedList<Conductor> obtenerConductoresCamionMas10Ton(Camion camionAux) {
        LinkedList<Conductor> conductoresCamionesMas10T = new LinkedList<>();

        for(Conductor conductor : listConductores) {
            if(conductor.getListvehiculos().contains(camionAux) && camionAux.getCapacidadCarga() > 10) {
                conductoresCamionesMas10T.add(conductor);
            }
        }
        return conductoresCamionesMas10T;
    }

    //obetener recaudador por nombre y apellido
    public Recaudador obtenerRecaudadorNombre(String nombreBuscar, String apellidoBuscar) {
        for(Recaudador recaudador : listRecaudadores) {
            if(recaudador.getNombre().equals(nombreBuscar) && recaudador.getApellido().equals(apellidoBuscar)) {
                return recaudador;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Conductor> getListConductores() {
        return listConductores;
    }

    public void setListConductores(LinkedList<Conductor> listConductores) {
        this.listConductores = listConductores;
    }

    public LinkedList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(LinkedList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public LinkedList<PagoPeaje> getListPagoPeajes() {
        return listPagoPeajes;
    }

    public void setListPagoPeajes(LinkedList<PagoPeaje> listPagoPeajes) {
        this.listPagoPeajes = listPagoPeajes;
    }

    public LinkedList<PuestoControl> getListPuestosControl() {
        return listPuestosControl;
    }

    public void setListPuestosControl(LinkedList<PuestoControl> listPuestosControl) {
        this.listPuestosControl = listPuestosControl;
    }

    public LinkedList<Recaudador> getListRecaudadores() {
        return listRecaudadores;
    }

    public void setListRecaudadores(LinkedList<Recaudador> listRecaudadores) {
        this.listRecaudadores = listRecaudadores;
    }
}
