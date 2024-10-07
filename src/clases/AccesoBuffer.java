package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoBuffer {

    public static void inicio() throws IOException {
        mostrarYcontarContenido("texto.txt");

    }

    private static boolean moostrarContenido(String nombreFichero) throws IOException {

        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader(nombreFichero));
            String frase = lector.readLine();

            while (frase != null) {
                System.out.println(frase);
                frase = lector.readLine();

            }

            return true;

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;

        } finally {

            if (lector != null) {
                lector.close();

            }

        }

    }

    private static boolean mostrarYcontarContenido(String fichero) throws IOException {
        // Contar signifca contar las líneas totales y cuantas vacías hay.

        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader(fichero));
            String frase = lector.readLine();
            int totalLineas = 0;
            int totalVacias = 0;

            while (frase != null) {

                totalLineas++;

                if (frase.isEmpty()) {
                    totalVacias++;

                }

                System.out.println(frase);
                frase = lector.readLine();

            }

            System.out.println("Total líneas: " + totalLineas);
            System.out.println("Total vacías: " + totalVacias);

            return true;

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;

        } finally {

            if (lector != null) {
                lector.close();

            }

        }

    }

}
