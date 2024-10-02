import java.io.File;

public class App2 {

    public static void main(String[] args) {

        // Listar directorios y ficheros de nuestro directorio de trabajo.
        // ficheros lleva una F antes.
        // Directorios llevan una D adelante.

        File directorio = new File(".");
        File[] listado = directorio.listFiles();

        for (int i = 0; i < listado.length; i++) {

            if (listado[i].isDirectory()) {
                System.out.println("D " + listado[i].getName());
                listado[i].listFiles();
                File[] listado2 = listado[i].listFiles();

                for (int j = 0; j < listado2.length; j++) {

                    if (listado2[j].isDirectory()) {
                        System.out.println("   D " + listado2[j].getName());

                    } else {
                        System.out.println("   F " + listado2[j].getName());

                    }

                }

            } else {
                System.out.println("F " + listado[i].getName());

            }

        }

    }

}
