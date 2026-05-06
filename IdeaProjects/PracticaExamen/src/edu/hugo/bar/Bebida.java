package edu.hugo.bar;

import java.sql.Wrapper;

public class Bebida {
    private String nombre;
    private String marca;
    private double precioBase;
    private Double calorias;
    private static int totalBebidasServida;
    private static double recaudacionTotalBar;

    public double getPrecioVenta(){
        return precioBase;
    }

    public Bebida(String nombre, String marca, double precioBase, Double calorias) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.calorias = calorias;
    }

    public Bebida() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return precioBase;
    }

    public void setCosto(double costo) {
        this.precioBase = costo;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public static int getTotalBebidasServida() {
        return totalBebidasServida;
    }

    public static void setTotalBebidasServida(int totalBebidasServida) {
        Bebida.totalBebidasServida = totalBebidasServida;
    }

    public static double getRecaudacionTotalBar() {
        return recaudacionTotalBar;
    }

    public static void setRecaudacionTotalBar(double recaudacionTotalBar) {
        Bebida.recaudacionTotalBar = recaudacionTotalBar;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precioBase=" + precioBase +
                ", calorias=" + calorias +
                '}';
    }


}

