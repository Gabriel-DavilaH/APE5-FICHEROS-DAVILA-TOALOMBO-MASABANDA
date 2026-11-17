import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompetenciaVideojuegos {
    public static void main(String[] args) {
        String archivo = "jugadores.txt";
        double total = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        String mejorJugador = "";
        int cantidad = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",", 2);

                if (datos.length != 2 || datos[0].trim().isEmpty()) {
                    System.out.println("Registro con formato incorrecto: " + linea);
                    continue;
                }

                try {
                    String nombre = datos[0].trim();
                    double puntuacion = Double.parseDouble(datos[1].trim());

                    System.out.println(nombre + " - " + puntuacion);
                    total += puntuacion;
                    cantidad++;

                    if (puntuacion > mayor) {
                        mayor = puntuacion;
                        mejorJugador = nombre;
                    }
                    if (puntuacion > 70) {
                        System.out.println("Supera 70 puntos: " + nombre);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Puntuación no válida: " + linea);
                }
            }

            if (cantidad > 0) {
                System.out.println("Promedio: " + (total / cantidad));
                System.out.println("Mayor puntuación: " + mayor);
                System.out.println("Jugador con mayor puntaje: " + mejorJugador);
            } else {
                System.out.println("No hay registros válidos.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
