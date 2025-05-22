package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {

    private int capacidadCarga;
    private int numeroEjes;

    public Camion(int capacidadCarga, int numeroEjes, String placa, int numeroPeajes) {
        super(placa, numeroPeajes);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double calcularValorTarifa() {
        double valorTarifa = 0;

        if(capacidadCarga > 10){
            valorTarifa = (numeroEjes * 7000) * 0.1 + numeroEjes * 7000;
        }else {
            valorTarifa = numeroEjes * 7000;
        }
        return valorTarifa;
    }

    @Override
    public String mostrarDetalles() {
        return "camion con placa "+ getPlaca()+ " numero de ejes "+ getNumeroEjes()+ "capacidad de carga "+ getCapacidadCarga()+ "toneladas "+ "numero de peajes "+getNumeroPeajes();
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
