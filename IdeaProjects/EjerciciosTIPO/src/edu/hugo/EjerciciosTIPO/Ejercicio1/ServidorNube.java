package edu.hugo.EjerciciosTIPO.Ejercicio1;

import java.util.HashMap;

public class ServidorNube {

    private HashMap<String, String> almacenamiento;

    public ServidorNube() {
        almacenamiento = new HashMap<>();
        cargarArchivosBase();
    }

    public void cargarArchivosBase() {

        almacenamiento.put("documento.txt", "Contenido del documento");
        almacenamiento.put("foto.png", "Imagen de vacaciones");
        almacenamiento.put("notas.doc", "Notas de programación Java");
    }

    public String descargarArchivo(String nombreArchivo)
            throws ArchivoNoEncontradoException {

        if (!almacenamiento.containsKey(nombreArchivo)) {

            throw new ArchivoNoEncontradoException(
                    "El archivo '" + nombreArchivo + "' no existe en el servidor."
            );
        }

        return almacenamiento.get(nombreArchivo);
    }
}
