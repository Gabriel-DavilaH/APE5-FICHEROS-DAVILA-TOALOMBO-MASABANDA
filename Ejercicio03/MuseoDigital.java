
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MuseoDigital {

    public static void main(String[] args) {

        int pintura = 0;
        int escultura = 0;
        int fotografia = 0;
        int total = 0;

        try {
            BufferedReader lector = new BufferedReader(
                new FileReader("obras.txt")
            );

            String linea;

            System.out.println("=== MUSEO DIGITAL ===");
            System.out.println("REGISTRO DE OBRAS\n");

            while ((linea = lector.readLine()) != null) {

                System.out.println(linea);

                String[] datos = linea.split(";");

                if (datos.length == 2) {

                    String categoria = datos[1].trim();

                    if (categoria.equalsIgnoreCase("Pintura")) {
                        pintura++;
                    } else if (categoria.equalsIgnoreCase("Escultura")) {
                        escultura++;
                    } else if (categoria.equalsIgnoreCase("Fotografia")) {
                        fotografia++;
                    }

                    total++;
                }
            }

            lector.close();

            System.out.println("\n=== CLASIFICACION ===");
            System.out.println("Pinturas: " + pintura);
            System.out.println("Esculturas: " + escultura);
            System.out.println("Fotografias: " + fotografia);
            System.out.println("Total de obras: " + total);

        } catch (IOException e) {

            System.out.println("Error al leer el archivo.");

        }
    }
}
