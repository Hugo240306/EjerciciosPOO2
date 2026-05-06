package edu.hugo.bar;

import java.util.ArrayList;

public class Coctel extends Bebida{
    ArrayList<Bebida> ingredientes = new ArrayList<>();

    @Override
    public double getPrecioVenta(){
        double precioTotalCoctel = 0;
        for(Bebida bebida : ingredientes){
            precioTotalCoctel=precioTotalCoctel+bebida.getPrecioVenta();

        }
        return precioTotalCoctel+2;
    }

    public Coctel(String nombre, String marca, double precioBase, Double calorias, ArrayList<Bebida> ingredientes) {
        super(nombre, marca, precioBase, calorias);
        this.ingredientes = ingredientes;
    }

    public Coctel(ArrayList<Bebida> ingredientes) {
        super();
        this.ingredientes = ingredientes;
    }
    public Coctel() {
        super();
    }

    public ArrayList<Bebida> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Bebida> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Coctel{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
