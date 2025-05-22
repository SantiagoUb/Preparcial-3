package co.edu.uniquindio.poo;

public class Carro extends  Vehiculo {

    private TipoCarro tipoCarro;
    private boolean servicio;
    private double valorBase;

    public Carro(TipoCarro tipoCarro, boolean servicio, double valorBase, String placa, int numeroPeajes) {
        super(placa, numeroPeajes);
        this.tipoCarro = tipoCarro;
        this.servicio = true;
        this.valorBase = 10000;

    }

    @Override
    public double calcularValorTarifa() {
        double valorTarifa = 0;

        if(tipoCarro == TipoCarro.ELECTRICO && servicio){
            valorTarifa = (valorBase - valorBase * 0.2) * 0.15 + valorBase - valorBase * 0.2;
        }else if(tipoCarro == TipoCarro.COMBUSTION && servicio){
            valorTarifa = valorBase * 0.15 + valorBase;
        }else if(tipoCarro == TipoCarro.ELECTRICO) {
            valorTarifa = valorBase - valorBase * 0.15;
        }else {
            valorTarifa = valorBase;
        }
        return valorTarifa;
    }

    @Override
    public String mostrarDetalles() {
        return "carro " + getTipoCarro()+" con placa "+ getPlaca()+" numero peajes "+ getNumeroPeajes();
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public boolean isServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
