import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ControlTemperaturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String archivo = "temperaturas.txt";

        System.out.print("Ingrese una temperatura: ");
        String nuevaTemperatura = entrada.nextLine();

        try {
            Double.parseDouble(nuevaTemperatura.trim());
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {
                escritor.write(nuevaTemperatura.trim());
                escritor.newLine();
                System.out.println("Temperatura guardada.");
            }
        } catch (NumberFormatException e) {
            System.out.println("La temperatura debe ser un número.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        double total = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        int cantidad = 0;
        int superiores = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("\nTemperaturas registradas:");
            while ((linea = lector.readLine()) != null) {
                try {
                    double temperatura = Double.parseDouble(linea.trim());
                    System.out.println(temperatura);
                    total += temperatura;
                    cantidad++;
                    if (temperatura > mayor) {
                        mayor = temperatura;
                    }
                    if (temperatura > 30) {
                        superiores++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Dato no válido: " + linea);
                }
            }

            if (cantidad > 0) {
                System.out.println("Promedio: " + (total / cantidad));
                System.out.println("Temperatura más alta: " + mayor);
                System.out.println("Registros superiores a 30 grados: " + superiores);
            } else {
                System.out.println("No hay temperaturas válidas.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        entrada.close();
    }
}
