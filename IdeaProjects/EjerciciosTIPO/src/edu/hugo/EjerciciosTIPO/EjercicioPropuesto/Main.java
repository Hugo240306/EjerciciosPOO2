package edu.hugo.EjerciciosTIPO.EjercicioPropuesto;
/*
1-100 números aleatorios(0 a 100): se pueden repetir
2-Mostrar un menú (infinito -> si quiero ver los pares escojo la opción 1),veo
el resultado por consola y debe salir el menú de nuevo SIN calcular de nuevo
los números aleatorios.
A la hora de ver un número tendremos que ver también el número de veces que
ha salido.
3-Crear excepciones propias si lo crees necesario.
------MENÚ------
1) Ver pares
2)Ver impares
3)Ver primos
4)Ver números que no salieron
5)Salir
 */
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("-----MENÚ-----");
            System.out.println("1) Ver pares");
            System.out.println("2) Ver impares");
            System.out.println("3) Ver primos");
            System.out.println("4) Ver números que no salieron");
            System.out.println("5. Salir");
        }

    }
    public void numerosPares(int[] numeros) {
        HashMap<Integer, Integer> contadorPares = new HashMap<>();
        for (int n : numeros) {
            if (n % 2 == 0) {
                contadorPares.put(n, contadorPares.getOrDefault(n, 0) + 1);
            }
        }

        System.out.println("NÚMEROS PARES:");
        mostrarResultados(contadorPares);

    }
    public void numerosImpares(int[] numeros) {
        HashMap<Integer, Integer> contadorImpares = new HashMap<>();
        for (int n : numeros) {
            if (n % 2 != 0) {
                contadorImpares.put(n, contadorImpares.getOrDefault(n, 0) + 1);
            }
        }
        System.out.println("NÚMEROS IMPARES:");
        mostrarResultados(contadorImpares);
    }
    public void numerosPrimos(int[] numeros) {
        HashMap<Integer, Integer> contadorPrimos = new HashMap<>();
        for (int n : numeros) {
            if (esPrimo(n)) {
                contadorPrimos.put(n, contadorPrimos.getOrDefault(n, 0) + 1);
            }
        }

        System.out.println("NÚMEROS PRIMOS:");
        mostrarResultados(contadorPrimos);
    }
    public void numerosNoAparecen(int[] numeros) {
        HashMap<Integer, Integer> contadorNoAparecen = new HashMap<>();
    }
}
