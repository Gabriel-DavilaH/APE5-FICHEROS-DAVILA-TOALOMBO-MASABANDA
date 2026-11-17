
import java.io.FileReader;
import java.io.IOException;

public class EstacionEspacial {

    public static void main(String[] args) {

        int caracter;
        int contador = 0;

        try {
            FileReader lector = new FileReader("mensaje.txt");

            System.out.println("=== ESTACION ESPACIAL ===");
            System.out.println("MENSAJE DE EMERGENCIA:\n");

            while ((caracter = lector.read()) != -1) {

                System.out.print((char) caracter);
                contador++;

            }

            lector.close();

            System.out.println("\n\nTotal de caracteres: " + contador);

        } catch (IOException e) {

            System.out.println("Error al leer el archivo.");

        }
    }
}
