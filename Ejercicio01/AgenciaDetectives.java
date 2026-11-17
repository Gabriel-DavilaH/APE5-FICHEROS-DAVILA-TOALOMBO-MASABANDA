
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AgenciaDetectives {

    public static void main(String[] args) {

        int contador = 0;

        try {
            BufferedReader lector = new BufferedReader(
                new FileReader("pistas.txt")
            );

            String linea;

            System.out.println("=== AGENCIA DE DETECTIVES ===");
            System.out.println("PISTAS DE LA INVESTIGACION\n");

            while ((linea = lector.readLine()) != null) {

                System.out.println(linea);
                contador++;

            }

            lector.close();

            System.out.println("\nTotal de pistas: " + contador);

        } catch (IOException e) {

            System.out.println("Error al leer el archivo.");

        }
    }
}
