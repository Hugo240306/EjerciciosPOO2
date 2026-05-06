package edu.hugo.bar;

public class Combinado extends Bebida {
    private Bebida alcohol;
    private Bebida mezclador;

    @Override
    public double getPrecioVenta() {
        return (alcohol.getPrecioVenta()+mezclador.getPrecioVenta()*1.1);
    }

    public Combinado(String nombre, String marca, double precioBase, Double calorias, Bebida alcohol, Bebida mezclador) {
        super(nombre, marca, precioBase, calorias);
        this.alcohol = alcohol;
        this.mezclador = mezclador;
    }

    public Combinado(Bebida alcohol, Bebida mezclador) {
        super();
        this.alcohol = alcohol;
        this.mezclador = mezclador;
    }
    public Combinado(){
        super();
    }

    public Bebida getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Bebida alcohol) {
        this.alcohol = alcohol;
    }

    public Bebida getMezclador() {
        return mezclador;
    }

    public void setMezclador(Bebida mezclador) {
        this.mezclador = mezclador;
    }

    @Override
    public String toString() {
        return "Combinado{" +
                "alcohol=" + alcohol +
                ", mezclador=" + mezclador +
                '}';
    }
}
