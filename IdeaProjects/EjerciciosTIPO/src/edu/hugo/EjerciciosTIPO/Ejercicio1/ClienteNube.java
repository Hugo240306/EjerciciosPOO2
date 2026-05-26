package edu.hugo.EjerciciosTIPO.Ejercicio1;

import java.util.Scanner;

public class ClienteNube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ServidorNube servidor = new ServidorNube();

        System.out.println("Introduce el nombre del archivo a descargar:");
        String nombreArchivo = sc.nextLine();

        try {

            String contenido = servidor.descargarArchivo(nombreArchivo);

            System.out.println("Archivo descargado correctamente.");
            System.out.println("Contenido:");
            System.out.println(contenido);

        } catch (ArchivoNoEncontradoException e) {

            System.out.println("ERROR: " + e.getMessage());
        }
    }
}