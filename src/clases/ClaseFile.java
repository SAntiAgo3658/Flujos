package clases;
import java.io.File;
import java.io.IOException;

public class ClaseFile {

    public static void inicio() throws IOException {
        File fichero;
        fichero = new File("datos.txt");

        if (!fichero.exists()) {
            fichero.createNewFile();
            System.out.println("fichero creado");

        } else {

            System.out.println("Fichero ya estaba creado");

        }

        File fichero2 = new File("C:\\Users\\SantiagoElíasDavidGo\\Desktop\\Programs\\manejo de ficheros\\flujos\\datos2.txt");
        fichero2.createNewFile();

        File directorio = new File("directorio");
        directorio.mkdir();

        File directorio2 = new File(".\\directorio\\subdirectorio\\ultimodirectorio");
        directorio2.mkdirs();

        // Mover fichero a último directorio

        System.out.println(fichero.getAbsolutePath());

        File fichero3 = new File(".\\directorio\\subdirectorio\\ultimodirectorio\\datos.txt");

        System.out.println(fichero.renameTo(fichero3));

        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero3.getAbsolutePath());

    }
    
}
