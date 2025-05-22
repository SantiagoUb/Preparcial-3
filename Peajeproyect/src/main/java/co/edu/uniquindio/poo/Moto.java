package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(int cilindrada, String placa, int numeroPeajes) {
        super(placa, numeroPeajes);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorTarifa() {
        double valorTarifa = 0;

        if(cilindrada > 200){
            valorTarifa = 7000;
        }else {
            valorTarifa = 5000;
        }
        return valorTarifa;
    }

    @Override
    public String mostrarDetalles() {
        return "moto con placa "+ getPlaca()+ " numero peajes "+ getNumeroPeajes()+ " cilindrada "+ cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
