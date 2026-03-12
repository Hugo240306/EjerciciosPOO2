package edu.hugo.ejerciciosPOO2.Ejercicio3;
/*3. La Peor Generación (One Piece)

Objetivo: Encontrar el valor máximo en un ArrayList<Double> usando foreach.

Enunciado: La Marina tiene una lista con las recompensas (en millones de Berries) de varios piratas.
Crea un método estático buscarRecompensaMaxima que reciba la lista y devuelva el valor más alto usando
un bucle. Si la lista está vacía, debe devolver 0.0. */

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<Double>(Arrays.asList(1.5,1.3,1.9,2.8,3.5));
        //ArrayList<Double> lista = new ArrayList<Double>();
        System.out.println(buscarRecompensaMaxima(lista));
    }
    public static double buscarRecompensaMaxima(ArrayList<Double> lista){
        double mayor =0;
        if(lista.isEmpty()){
            return 0.0;
        }
        for(Double d: lista){
            if(d>mayor){
                mayor = d;
            }

        }
        return mayor;

    }
}
