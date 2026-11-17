import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParqueAventuras {
    public static void main(String[] args) {
        String archivo = "resultados.txt";
        double total = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        String participanteMayor = "";
        int contador = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",", 2);

                if (datos.length == 2) {
                    try {
                        String nombre = datos[0].trim();
                        double puntaje = Double.parseDouble(datos[1].trim());

                        System.out.println(nombre + " - Puntaje: " + puntaje);
                        total += puntaje;
                        contador++;

                        if (puntaje > mayor) {
                            mayor = puntaje;
                            participanteMayor = nombre;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Puntaje no válido: " + linea);
                    }
                } else {
                    System.out.println("Registro no válido: " + linea);
                }
            }

            System.out.println("Puntaje total: " + total);
            if (contador > 0) {
                System.out.println("Puntaje más alto: " + mayor);
                System.out.println("Participante: " + participanteMayor);
            } else {
                System.out.println("No existen puntajes válidos.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
