package clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FlujoByteVariosAccesos {

    public static void inicio() throws IOException {

        Scanner teclado = new Scanner(System.in);

        // Abrir flujo para escribir y cerrarlo.

        escribir(true);

        // Abrir flujo para leer y mostrar datos.

        leer();

        // Repetir lo mismo para ver si se mantienen todos los datos.

        escribir(false);

        System.out.println();

        leer();

        teclado.close();

    }

    public static void escribir(boolean minusculas) throws IOException {

        FileOutputStream escritor = null;

        try {
            escritor = new FileOutputStream("datos.dat", true);

            int inicio = 0;

            if (minusculas) {
                inicio = 97;

            } else {
                inicio = 65;

            }

            for (int i = inicio; i < inicio + 26; i++) {
                escritor.write(i);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } finally {

            if (escritor != null) {
                escritor.close();

            }

        }

    }

    public static void leer() throws IOException {

        FileInputStream lector = null;

        try {
            lector = new FileInputStream("datos.dat");

            int letra = lector.read();

            while (letra > 0) {
                System.out.print((char) letra + " ");
                letra = lector.read();

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } finally {

            if (lector != null) {
                lector.close();

            }

        }

    }

}
