import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorio {

    public static void main(String[] args) throws IOException {

        RandomAccessFile acceso = null;
        try {
            acceso = new RandomAccessFile("datos.txt", "rw");
            acceso.seek(4);
            System.out.println((char) acceso.read());
            acceso.seek(0);
            System.out.println(acceso.readLine());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } finally {
            if (acceso != null) {
                acceso.close();
                
            }
        }
        
    }
    
}
