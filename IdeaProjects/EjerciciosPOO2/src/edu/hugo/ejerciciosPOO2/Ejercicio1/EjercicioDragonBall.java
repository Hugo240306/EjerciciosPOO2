package edu.hugo.ejerciciosPOO2.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;

/*Objetivo: Recorrer un ArrayList<Integer> con foreach y filtrar datos con if.

Enunciado: Crea un programa que tenga una lista de niveles de poder de distintos guerreros.
Crea un método estático llamado mostrarPoderosos que reciba ese ArrayList.
 El método debe imprimir solo los niveles de poder que sean mayores a 9000. */
public class EjercicioDragonBall {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(200,9600,15000,8900,130000));
        mostrarPoderosos(lista);
    }
    public static void mostrarPoderosos (ArrayList<Integer> lista){
        for(Integer i: lista){
            if(i>9000){
                System.out.println("Los niveles mayores a 9000 son: " + i);
            }

        }
    }
}

