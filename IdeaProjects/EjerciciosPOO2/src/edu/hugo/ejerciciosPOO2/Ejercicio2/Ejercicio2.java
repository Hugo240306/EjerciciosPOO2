package edu.hugo.ejerciciosPOO2.Ejercicio2;
/*2. Registro en la Pokédex (Pokémon)

Objetivo: Búsqueda en un ArrayList<String> usando un bucle for tradicional y métodos de String.

Enunciado: Tienes una lista de nombres de Pokémon. Crea un método estático contarPorLetra que reciba el
ArrayList y una letra (char). El método debe devolver cuántos Pokémon empiezan por esa letra. */

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Pikachu","Charmander","Cucas","Mewtwo","Ipi"));
        contarPorLetra(lista,'C');
    }
    public static void contarPorLetra (ArrayList<String> lista, char letra){
        String letraEnString = String.valueOf(letra);
        int contador=0;
        for(int i=0; i<lista.size();i++){
            lista.get(i).startsWith(letraEnString);
            if(lista.get(i).startsWith(letraEnString)){
                contador++;
            }
        }
        System.out.println("Empiezan por la letra " + letraEnString + " este número pokemon: " + contador);

    }
}
